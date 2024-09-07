package java_11_polymorphism;

public class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dog moving");
    }

    void bark() {
        System.out.println("Dog barking");
    }

}
