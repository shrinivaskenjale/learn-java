package java_05_classes_and_objects;

class Person {
    // ==========================
    // Instance variables/fields
    // ==========================

    String name;
    int age;

    // ====================
    // Instance methods
    // ====================

    void printInformation() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    // Method that takes parameters.
    void speak(String text) {
        System.out.println(text);
    }

    // Method that returns a value.
    int getYearsLeftToRetire() {
        int yearsLeft = 60 - age;
        return yearsLeft;
    }

}

public class L02_InstanceMembers {
    public static void main(String[] args) {

        // Create a object
        Person p1 = new Person(); // Make call to constructor

        // Access instance variables through instance using dot operator.
        p1.name = "Shrinivas Kenjale";
        p1.age = 21;
        System.out.println(p1.age + " " + p1.name);

        // Call the instance methods.
        p1.speak("Good Morning");
        p1.printInformation();
        System.out.println(p1.getYearsLeftToRetire());

        // Each instance gets separate copy of instance variables.
        Person p2 = new Person();
        p2.age = 16;
        p2.name = "Randy";
        System.out.println(p2.age + " " + p2.name);

    }
}

/*
 * ====================
 * Instance members
 * ====================
 * 
 * Instance members of a class are variables and methods that belong to an
 * instance of the class.
 * 
 * Each object created from the class has its own separate copy of these
 * members.
 * 
 * Instance methods can access instance variables.
 * 
 * 
 */