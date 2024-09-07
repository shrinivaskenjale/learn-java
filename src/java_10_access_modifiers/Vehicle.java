package java_10_access_modifiers;

public class Vehicle {
    public String make;
    public final static String STATE = "MH";
    protected String model;
    int year;
    private String color;

    // All modifiers are applicable to constructors too. Just like normal methods.
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println(STATE);
    }

    public Vehicle() {
    }

    // Getters and setters for private fields
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

/*
 * It is bad practice to make fields public. Rather, make them
 * private and create getters and setters.
 * 
 * It is ok to make constant variables public.
 * 
 */