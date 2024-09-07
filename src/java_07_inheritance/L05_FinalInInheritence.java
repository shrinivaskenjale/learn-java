package java_07_inheritance;

class Vehicle {
    // final method
    public final void move() {
        System.out.println("Vehicle is moving");
    }
}

// final class
final class Car extends Vehicle {
    // Can't override final method move() from Vehicle class
    // @Override
    // public void move() {
    // System.out.println("Car is moving");
    // }

    // Final field
    // final int K = 4; // a. Initialize when declaring

    final int K;

    Car() {
        K = 4; // b. Initialize in the constructor
        // K = 5; // Error if try to reassign
    }

}

// The final class cannot be inherited by another class
// class SportsCar extends Car {
// }

public class L05_FinalInInheritence {
    public static void main(String[] args) {

        final int AGE = 23; // final variable

        // AGE = 25; // Error
        System.out.println(AGE);

        Car car = new Car();
        car.move();

    }
}

/*
 * ================
 * final
 * ================
 * 
 * In Java, the final keyword is used to denote constants. It can be used with
 * variables, methods, and classes.
 * 
 * Once any entity (variable, method or class) is declared final, it can be
 * assigned only once. That is,
 * 1. the final variable cannot be reassigned with another value
 * 2. the final method cannot be overridden by the subclass
 * 3. the final class cannot be extended
 * 
 * Final member variables of a class can be initialized only once:
 * a. When declaring.
 * b. In the constructor, because constructor is called only once for each
 * object.
 * 
 * 
 * It is recommended to use uppercase to declare final variables in Java.
 */