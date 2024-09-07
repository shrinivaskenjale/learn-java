package java_10_access_modifiers_2;

import java_10_access_modifiers.Vehicle;

public class Bike extends Vehicle {
    public Bike(String make, String model, int year, String color) {
        this.make = make; // public
        this.model = model; // protected
        // this.year = year; // default
        // this.color = color; // private
        System.out.println(Bike.STATE); // public

    }
}
