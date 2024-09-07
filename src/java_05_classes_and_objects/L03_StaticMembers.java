package java_05_classes_and_objects;

class Thing {

    String name; // Instance variable
    static String description; // Static variable
    static int instanceCount = 0; // Static variable

    // instanceCount is a static variable to count the number of instances of a
    // class Thing.

    // Constants
    final int COST = 2343;
    final static int LUCKY_NUMBER = 45; // Static constant

    // Constructor
    Thing() {
        // Constructor can access both instance and static members.
        instanceCount += 1; // or Thing.instanceCount += 1;
    }

    // Static method
    static void showInfo() {
        System.out.println("Static method: showInfo()");

        // We can access only static members inside static method.
        System.out.println(description);

        // We cannot access instance members inside static method.
        // System.out.println(name); // Error
    }

    // Instance method
    void showName() {
        System.out.println("Instance method: showName()");

        System.out.println(name); // this.name

        // Instance methods can access static fields too.
        System.out.println(description); // or Thing.description

    }
}

public class L03_StaticMembers {
    public static void main(String[] args) {

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Thing 1";
        thing2.name = "Thing 2";

        // Accessing static members
        Thing.description = "I am a thing.";
        Thing.showInfo();

        // We can access static members with instances, but should be avoided.
        // thing1.description = "New description";
        // thing2.showInfo();
        // System.out.println(thing1.description);
        // System.out.println(thing2.description);

        // We can only access final variables and cannot reassign value to them.
        // Thing.LUCKY_NUMBER = 54; // Error
        System.out.println(Thing.LUCKY_NUMBER);
        System.out.println(thing1.COST);

        System.out.println("No. of instances of Thing are: " + Thing.instanceCount);

    }
}

/*
 * ========================
 * Static members
 * ========================
 * 
 * Static members are also called as class members because they belong to
 * the class and not to the individual instance of the class.
 * 
 * Static variables are shared by all instances of the class.
 * 
 * Use `static` keyword to declare static members.
 * 
 * Static members are accessed on the class using dot(.) operator. But inside
 * the class, they can be used directly.
 * 
 * ========================
 * Uses of static members:
 * ========================
 * 
 * 1. We can make method a static if it does not access any instance field.
 * 2. For declaring static constant values (along with `final` keyword).
 * 3. For counting no. of instances of class.
 * 
 * =================
 * Constants
 * =================
 * 
 * `final` keyword is used to make a variable a constant.
 * We must assign value to final variables when declaring.
 * We cannot reassign the value to such variables.
 * 
 * Static variables are rarely used in Java. Instead, the static constants are
 * used. These static constants are defined by `static final` keyword and
 * represented in uppercase
 * => static final double PI = 3.14;
 */