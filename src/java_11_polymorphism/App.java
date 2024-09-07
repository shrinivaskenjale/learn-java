package java_11_polymorphism;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.move();

        // Parent class/interface variables can reference child class objects.
        Animal animal2 = dog;

        // When we call overridden method, we access method of object's class.
        animal2.move();

        dog.bark();

        // Even though animal2 is referencing Dog object, we can't access method
        // bark() because we can only access members of reference type.
        // animal2.bark(); // error

        // Similarly, it can't access private methods of parent class since object of
        // child class doesn't have access to private fields.

        System.out.println(animal2 instanceof Dog);

    }

}

/*
 * =============
 * Polymorphism
 * =============
 * 
 * Polymorphism is the ability of an object to take on many forms.
 * 
 * Polymorphism means quality of existing in different forms.
 * 
 * The same entity (method or operator or object) can perform different
 * operations in different scenarios.
 * 
 * We can achieve polymorphism in Java using the following ways:
 * 1. Method Overriding
 * 2. Method Overloading
 * 3. Operator Overloading
 * 
 * 
 * ==================
 * Method overriding
 * ==================
 * 
 * In this case, the same method will perform one operation in the superclass
 * and another operation in the subclass.
 * 
 * The method that is called is determined during the execution of the program.
 * Hence, method overriding is a run-time polymorphism.
 * 
 * 
 * ==================
 * Method overloading
 * ==================
 * 
 * Here, the same method will perform different operations based on the
 * parameter.
 * 
 * The method that is called is determined by the compiler. Hence, it is also
 * known as compile-time polymorphism.
 * 
 * =====================
 * Operator overloading
 * =====================
 * 
 * Some operators in Java behave differently with different operands. For
 * example,
 * => + operator is overloaded to perform numeric addition as well as string
 * concatenation, and
 * => operators like &, |, and ! are overloaded for logical and bitwise
 * operations.
 * 
 * In languages like C++, we can define operators to work differently for
 * different operands. However, Java doesn't support user-defined operator
 * overloading.
 * 
 * 
 * =======================
 * Polymorphic Variables
 * =======================
 * 
 * A variable is called polymorphic if it refers to different values under
 * different conditions.
 * 
 * Object variables represent the behavior of polymorphic variables in Java. It
 * is because object variables of a class/interface/abstract classes can refer
 * to objects of its class as well as objects of its subclasses.
 * 
 */