package java_05_classes_and_objects;

class Animal {
    // Compiler creates default no-arg constructor.
}

class Machine {
    String name;
    int code;

    // No-arg constructor
    Machine() {
        // Call constructor with 2 parameters
        this("Sam", 0); // Should be first statement
        System.out.println("Constuctor with no parameters");
    }

    // Parameterized constructor
    Machine(String name) {
        System.out.println("Constructor with 1 parameter");
        this.name = name;
    }

    // Parameterized constructor
    Machine(String name, int code) {
        System.out.println("Constructor with 2 parameters");
        this.name = name;
        this.code = code;
    }
}

public class L05_Constructors {
    public static void main(String[] args) {
        // Create instances of the class by calling the constructor along with `new`
        // keyword.

        // Calling default constructor
        Animal animal = new Animal();
        System.out.println(animal.getClass().getSimpleName());

        // Compiler automatically selects right constructor to run.
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Alex");
        Machine machine3 = new Machine("Peter", 33);

        System.out.println(machine1 + " " + machine2 + " " + machine3);

    }
}

/*
 * 
 * ==========================
 * Constructors
 * ==========================
 * 
 * Constructor is a special method which is called automatically when we create
 * new instance of a class.
 * 
 * Constructor should have same name as of the class.
 * 
 * Constructors do not have return type.
 * 
 * Generally, constructors are used to initialize instance variables.
 * 
 * 
 * When we don't declare any constructor, compiler uses default constructor. But
 * as soon as we create a constructor, default constructor dies.
 * 
 * A constructor cannot be abstract or static or final.
 * 
 * A constructor can be overloaded but cannot be overridden.
 * 
 * =====================
 * Types of Constructor
 * =====================
 * 
 * 1. No-Arg Constructor:
 * A constructor that does not accept any parameters.
 * 
 * 2. Parameterized Constructor:
 * A constructor that takes one or more parameters.
 * 
 * 3. Default Constructor:
 * If we do not create any constructor, the Java compiler automatically creates
 * a no-arg constructor during the compilation of the program. This constructor
 * is called the default constructor.
 * 
 * 
 * =====================
 * Private constructors
 * =====================
 * 
 * If a constructor is declared private, it cannot be accessed outside
 * the class.
 * 
 * So, creating objects outside the class is prohibited using the private
 * constructor.
 * 
 * =============
 * this keyword
 * =============
 * 
 * The `this` keyword is used to refer to the current object inside an instance
 * method or a constructor.
 * 
 * We can use `this` keyword along with dot(.) operator to access instance
 * variables inside methods or constructors when parameters and instance
 * variables have same name.
 * If we don't use `this`, parameters get higher priority since they are closer
 * to the method.
 * 
 * We can call other overloaded constructor from one constructor using `this()`.
 * Constructor call must be the first statement in a constructor.
 * Invoking one constructor from another constructor is called explicit
 * constructor invocation.
 * 
 * We can use this keyword to pass the current object as an argument to a
 * method.
 * 
 * We can return `this` from the instance method to return the object from
 * instance method. This makes the method chainable and call other instance
 * methods.
 * 
 */