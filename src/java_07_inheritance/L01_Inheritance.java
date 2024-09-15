package java_07_inheritance;

class Animal {

    String name;

    public void eat() {
        System.out.println("I can eat");
    }

    // Static method
    static void info() {
        System.out.println("Animal info");
    }
}

// Dog inherits members from Animal
class Dog extends Animal {

    // New method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }

    // Static method - Hides info() of the superclass.
    static void info() {
        System.out.println("Dog info");
    }
}

public class L01_Inheritance {
    public static void main(String[] args) {

        // Create an object of the subclass.
        Dog labrador = new Dog();

        labrador.name = "Rohu";
        labrador.display();
        labrador.eat();

        Animal.info();
        Dog.info();

    }
}

/*
 * ===============
 * Inheritance
 * ===============
 * 
 * Inheritance is one of the key features of OOP that allows us to create a new
 * class from an existing class.
 * 
 * The new class that is created is known as subclass (child or derived class)
 * and the existing class from where the child class is derived is known as
 * superclass (parent or base class).
 * 
 * The `extends` keyword is used to perform inheritance in Java.
 * 
 * Although classes can inherit only one class, they can implement multiple
 * interfaces.
 * 
 * By default all classes inherit java.lang.Object class.
 * 
 * ==================
 * is-a relationship
 * ==================
 * 
 * Inheritance is an is-a relationship. That is, we use inheritance only if
 * there exists an is-a relationship between two classes.
 * 
 * We can use "subclass is a superclass" relation to determine inheritance.
 * 
 * subclass is a superclass
 * - Car is a Vehicle
 * - Orange is a Fruit
 * - Surgeon is a Doctor
 * - Dog is an Animal
 * 
 * 
 * ===================
 * Working
 * ===================
 * 
 * Child class gets access to all members present in parent class except PRIVATE
 * members.
 * 
 * We can add additional members, which will be exclusive to child class
 * only.
 * 
 * Static members (variables and methods both) are not inherited. They are just
 * shared.
 * 
 * Static members are shared as long as they're are not hidden by another static
 * member with the same name and same parameters.
 * 
 * 
 * ===============
 * super keyword
 * ===============
 * 
 * In case of overriding, the super keyword is used to call the method of the
 * parent class from the method of the child class.
 * => super.methodName()
 * 
 * ========================
 * Benefits of inheritance
 * ========================
 * 
 * 1. The most important use of inheritance in Java is code reusability. The
 * code that is present in the parent class can be directly used by the child
 * class.
 * 
 * 2. Method overriding is also known as runtime polymorphism. Hence, we can
 * achieve Polymorphism in Java with the help of inheritance.
 * 
 * =====================
 * Types of inheritance
 * =====================
 * 
 * 1. Single Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 * 4. Multiple Inheritance
 * 5. Hybrid Inheritance
 * 
 * Java doesn't support multiple inheritance. However, we can achieve multiple
 * inheritance using interfaces.
 * 
 */