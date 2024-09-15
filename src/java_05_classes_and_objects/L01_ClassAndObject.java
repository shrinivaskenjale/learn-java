package java_05_classes_and_objects;

// We can create a class in Java using the `class` keyword.
class Lamp {
    // ===================
    // State or field
    // ===================

    // Stores the value for light.
    // true if light is on.
    // false if light is off.
    boolean isOn;

    // ===================
    // Behavior or method
    // ===================

    // Method to turn on the light.
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    // Method to turn off the light.
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

public class L01_ClassAndObject {
    public static void main(String[] args) {
        // Use `new` keyword along with the call to the constructor of the class to
        // create an object.

        // Create objects led and halogen.
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // We can use the name of objects along with the dot(.) operator to access
        // members of a class.
        led.turnOn();
        System.out.println(led.isOn);
        halogen.turnOff();

        // Getting class of the object
        System.out.println(led.getClass().getName()); // Fully qualified class name string
        System.out.println(led.getClass().getSimpleName()); // Only class name string

        // The instanceof operator is used to determine if a given Java object is an
        // instance of a given class, superclass, or interface.
        System.out.println(led instanceof Lamp); // true

    }
}

/*
 * ===================
 * Class & object
 * ===================
 * 
 * An object is any entity that has a state and behavior.
 * 
 * Class is a blueprint for the object.
 * 
 * An object is called an instance of a class.
 * 
 * Fields (variables) and methods represent the state and behavior of the object
 * respectively.
 * 
 * We can create multiple objects of a single class in Java.
 * 
 * Fields and methods of a class are also called members of the class.
 * 
 * We can also create objects inside the same class.
 * 
 * ==============================
 * Deafault values of variables
 * ==============================
 * 
 * byte => 0
 * short => 0
 * int => 0
 * long => 0L
 * float => 0.0f
 * double => 0.0d
 * boolean => false
 * char => '\u0000' (null character)
 * Reference type => null
 * 
 * Note - Only instance and static variables get these default values but local
 * variables do not. Local variables must be explicitly initialized before they
 * are used. If you try to use local variable without initializing it, the Java
 * compiler will produce an error.
 */

// https://www.programiz.com/java-programming/reflection
