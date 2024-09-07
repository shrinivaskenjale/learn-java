package java_10_access_modifiers_2;

import java_10_access_modifiers.Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bajaj", "Discover", 2006, "Blue");

        System.out.println(vehicle.make); // public
        System.out.println(Vehicle.STATE); // public
        // System.out.println(vehicle.model); // protected
        // System.out.println(vehicle.year); // default
        // System.out.println(vehicle.color); // private
    }
}
