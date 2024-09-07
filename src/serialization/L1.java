package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class L1 {
    public static void main(String[] args) {
        writeObjects();
        readObjects();
    }

    static void writeObjects() {
        System.out.println("Writing objects");

        Person john = new Person(23, "John");
        Person brock = new Person(65, "Brock");

        // Extension does not matter but convention is .ser
        try (FileOutputStream fos = new FileOutputStream("src/java_00_playground/people.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(john);
            oos.writeObject(brock);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readObjects() {
        System.out.println("Reading objects");

        try (FileInputStream fis = new FileInputStream("src/java_00_playground/people.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);) {

            // readObject() returns Object. So we need to downcast.
            Person john = (Person) ois.readObject();
            Person brock = (Person) ois.readObject();

            // readObject() may throw ClassNotFoundException if we try to read the object in
            // the program where class of that object does not exist.

            System.out.println(john);
            System.out.println(brock);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// java.io.NotSerializableException is thrown if we try to write object to file
// without implementing Serializable class.
// Class of custom objects should implement Serializable class.

class Person implements Serializable {
    // transient keyword does not include particular field during serialization
    // of object.
    // When object is deserialized, the transient field is populated with default
    // value of data type.
    private transient int id;
    // private int id;
    private String name;

    // Static fields are not serialized because they belong to class.
    static int count;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

}

/*
 * Serialization means converting object into binary data (byte stream).
 * Deserialization is reverse of serialization.
 * 
 * Serializable interface is empty. Empty interfaces are called marker
 * interfaces.
 * 
 * readObject() reads data in same order as written.
 * 
 * We have readXXX() and writeXXX() methods for primitive data types.
 * 
 * serialVersionUID field keeps track of version of the class using which object
 * was serialized.
 * We get InvalidClassException if we try to deserialize the object with
 * different version of the class having different serialVersionUID.
 * 
 * We can serialize the array of objects as long as objects in it are
 * serializable.
 * 
 * oos.writeObject(peopleArr);
 * Person[] people = (Person[]) ois.readObject();
 * 
 * oos.writeObject(peopleList);
 * 
 * @SuppressWarnings("unchecked")
 * List<Person> people = (ArrayList<Person>) ois.readObject();
 * -> You may get warning of unchecked cast due to type erasure in generic
 * types.
 * 
 * It is good idea to write count of objects before writing objects so that when
 * reading objects we can read the count and then read objects using for loop.
 * 
 * When objects are deserialized, constructors or getter-setters are not called
 * at all.
 */