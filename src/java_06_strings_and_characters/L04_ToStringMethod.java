package java_06_strings_and_characters;

class Bird {
    String name;
    int age;

    Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird [name=" + name + ", age=" + age + "]";
    }

}

public class L04_ToStringMethod {
    public static void main(String[] args) {
        Bird parrot = new Bird("Tony", 5);

        // When we print object, it uses string representation returned by toString()
        // method.
        System.out.println(parrot);

        System.out.println(parrot.toString());

        System.out.println(String.valueOf(parrot));

        // Default representation
        Object obj = new MyClass();
        System.out.println(obj);

    }
}

class MyClass {
}

/*
 * =====================
 * toString() method
 * =====================
 * 
 * toString() is inherited from Object class.
 * 
 * Returns a string representation of the object.
 * 
 * In general, the toString method returns a string that "textually represents"
 * this object. The result should be a concise but informative representation
 * that is easy for a person to read.
 * 
 * It is recommended that all subclasses override this method.
 * 
 * The string output is not necessarily stable over time or across JVM
 * invocations.
 * 
 * 
 * =======================
 * Default representation
 * =======================
 * 
 * If we do not override toString() method, java uses default representation.
 * 
 * The toString() method for class Object returns a string consisting of the
 * name of the class of which the object is an instance (not the reference), the
 * at-sign character `@', and the unsigned hexadecimal representation of the
 * hash code of the object.
 * 
 * In other words, this method returns a string equal to the value of:
 * => getClass().getName() + '@' + Integer.toHexString(hashCode())
 * => java_06_strings.Bird@4617c264
 * 
 */