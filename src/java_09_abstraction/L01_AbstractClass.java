package java_09_abstraction;

// Abstract class
abstract class Vehicle {

    // Abstract method
    abstract void brake();

    // Non-abstract method
    void move() {
        System.out.println("Vehicle is moving");
    }

}

// Class extending the abstract class
class Car extends Vehicle {

    @Override
    void brake() {
        System.out.println("Car is braking");
    }

}

class Bike extends Vehicle {

    @Override
    void brake() {
        System.out.println("Bike is braking");
    }

}

public class L01_AbstractClass {
    public static void main(String[] args) {

        // Vehicle vehicle = new Vehicle(); // Error

        Car car = new Car();
        car.move();
        car.brake();

        Bike bike = new Bike();
        bike.move();
        bike.brake();
    }
}

/*
 * =================
 * Abstract classes
 * =================
 * 
 * The `abstract` is a non-access modifier which can be used with classes and
 * instance methods.
 * 
 * The abstract class in Java cannot be instantiated but we can inherit it to
 * create a subclass to access it's members.
 * 
 * We use the abstract keyword to declare an abstract class.
 * 
 * An abstract class can have both the regular methods and abstract methods.
 * 
 * A method that doesn't have its body is known as an abstract method. We use
 * the same abstract keyword to create abstract methods.
 * 
 * A subclass must override all abstract methods of an abstract class. However,
 * if the subclass is declared abstract, it's not mandatory to override abstract
 * methods.
 * 
 * Static methods cannot be abstract.
 * We can access the static fields and static methods of an abstract class using
 * the reference of the abstract class.
 * 
 * An abstract class can have constructors like the regular class. And, we can
 * access the constructor of an abstract class from the subclass using the super
 * keyword.
 * 
 * A class can be either final or abstract, not both at the same time.
 * 
 * There are no implict access modifiers applied to fields or methods (including
 * abstract methods).
 * 
 * =============================
 * Abstract class vs Interface
 * =============================
 * 
 * We should use an abstract class when creating a base class that needs to be
 * inherited by other classes in a class hierarchy. If we need to define a
 * behavior that can be implemented by multiple unrelated classes, we should use
 * an interface.
 * 
 * Bird and Airplane classes can implement Flyable interface.
 * Car and Bike classes can extend Vehicle abstract class.
 */