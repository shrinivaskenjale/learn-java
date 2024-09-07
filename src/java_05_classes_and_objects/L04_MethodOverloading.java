package java_05_classes_and_objects;

class Car {
    // start() is the overlaoded method in Car class.

    int start() {
        System.out.println("Starting car in eco mode...");
        return 1;
    }

    double start(boolean power) {
        if (power) {
            System.out.println("Starting car in power mode...");
            return 1;
        }

        return start();
    }
}

public class L04_MethodOverloading {
    public static void main(String[] args) {
        Car swift = new Car();

        swift.start();
        swift.start(true);
    }
}

/*
 * ====================
 * Method Overloading
 * ====================
 * 
 * In Java, a method signature is part of the method declaration. It's the
 * combination of the method name and the parameter list.
 * 
 * In Java, two or more methods may have the same name if they differ in
 * parameters (different number of parameters, different types of parameters, or
 * different sequence). These methods are called overloaded methods and this
 * feature is called
 * method overloading.
 * 
 * Return type doesn't matter.
 * 
 * Both instance and static methods can be overloaded.
 * 
 * In Java, you can also overload constructors in a similar way like methods.
 * 
 */