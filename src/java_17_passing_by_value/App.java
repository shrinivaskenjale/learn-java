package java_17_passing_by_value;

// Java is pass-by-value.

public class App {
    public static void main(String[] args) {
        App app = new App();

        // ==================
        // Primitive types
        // ==================

        int value = 7;
        System.out.println("1. Value is: " + value);
        app.show(value);
        System.out.println("4. Value is: " + value);

        System.out.println();

        // ==================
        // Reference types
        // ==================

        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);

        app.show(person);
        System.out.println("4. Person is: " + person);

    }

    // Parameter variables have scope of method body.
    void show(int value) {
        System.out.println("2. Value is: " + value);

        value = 8;

        System.out.println("3. Value is: " + value);
    }

    // Method overloading
    void show(Person person) {
        System.out.println("2. Person is: " + person);

        // Comment/uncomment following line to see differences.
        person.setName("Alex");

        person = new Person("Mike");

        System.out.println("3. Person is: " + person);

    }
}

/*
 * Java is strictly pass-by-value.
 * 
 * ==================
 * Primitive types
 * ==================
 * 
 * Primitive types (such as int, boolean, char, etc.) are passed by value. This
 * means that a copy of the actual value is passed to the method. Modifying the
 * parameter inside the method does not affect the original value.
 * 
 * ===================
 * Reference types
 * ===================
 * 
 * Reference types (such as objects and arrays) are also passed by value.
 * However, what is passed is the value of the reference, which is the address
 * pointing to the actual object in the heap. This means the method receives a
 * copy of the reference, and both the original reference and the copy point to
 * the same object. Thus, modifying the object via the copied reference affects
 * the original object.
 * 
 * 
 */