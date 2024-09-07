package java_10_access_modifiers;

public class Car extends Vehicle {
    public Car(String make, String model, int year, String color) {
        this.make = make; // public
        this.model = model; // protected
        this.year = year; // default
        // this.color = color; // private
        System.out.println(STATE); // public
    }
}
