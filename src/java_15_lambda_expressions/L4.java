package java_15_lambda_expressions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class L4 {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500));

        // printCarsPriceRange(cars, 18000, 22000);
        // printCarByColor(cars, "Red");

        // System.out.println("\nPrinting cars between price 18000 and 22000");
        // printCars(cars, new CarCondition() {

        // @Override
        // public boolean test(Car c) {
        // return c.getPrice() >= 18000 && c.getPrice() <= 22000;
        // }
        // });

        // System.out.println("\nPrinting cars that are blue");
        // printCars(cars, new CarCondition() {

        // @Override
        // public boolean test(Car c) {
        // return c.getColor().equals("Blue");
        // }

        // });

        System.out.println("\nPrinting cars between price 18000 and 22000");
        printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);

        System.out.println("\nPrint blue cars");
        printCars(cars, (c) -> c.getColor().equals("Blue"));

        Function<Car, String> priceAndColor = (c) -> " price = " + c.getPrice() + " color = " + c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);

    }

    // public static void printCars(List<Car> cars, CarCondition condition) {
    // for (Car c : cars) {
    // if (condition.test(c)) {
    // c.printCar();
    // }
    // }
    // }

    // More generalized version using generics
    // public static void printCars(List<Car> cars, Condition<Car> condition) {
    // for (Car c : cars) {
    // if (condition.test(c)) {
    // c.printCar();
    // }
    // }
    // }

    public static void printCars(List<Car> cars, Predicate<Car> predicate) {
        for (Car c : cars) {
            if (predicate.test(c)) {
                c.printCar();
            }
        }
    }

    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
        for (Car c : cars) {
            if (low <= c.getPrice() && c.getPrice() <= high) {
                c.printCar();
            }
        }
    }

    public static void printCarByColor(List<Car> cars, String color) {
        for (Car c : cars) {
            if (c.getColor().equals(color)) {
                c.printCar();
            }
        }
    }

}

@FunctionalInterface
interface CarCondition {
    public boolean test(Car c);
}

// Generic version for conditions
@FunctionalInterface
interface Condition<T> {
    boolean test(T t);
}

class Car {
    String make;
    String model;
    String color;
    int price;

    public Car(String make, String model, String color, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
    }

    public void printCar() {
        System.out.println(this);
    }

}

/*
 * Built-in Functional Interfaces
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.
 * html
 * 
 * Commonality between printCarByColor and printCarsPriceRange:
 * a. both take list as argument
 * b. both have if condition, if true then print
 * c. both return nothing
 * 
 * If we want to filter cars based on some different condition, we have to make
 * different methods for each.
 * 
 * It would be better if user can just call one method and pass the condition to
 * it as argument.
 * Same thing is done in printCars() method.
 * 
 * Predicate
 * Represents a predicate (boolean-valued function) of one argument.
 * It is present if java.util.function package. This package has many FIs.
 * This is a functional interface whose functional method is test().
 * 
 * Function
 * Represents a function that accepts one argument and produces a result.
 * This is a functional interface whose functional method is apply().
 * 
 * 
 */
