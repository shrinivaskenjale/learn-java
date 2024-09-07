package java_05_classes_and_objects;

class Data {
    private String name; // instance variable

    private static String description; // static variable

    // Generally getters and setters are used for private or protected instance
    // variables.

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Data.description = description;
    }

}

public class L06_GettersSetters {
    public static void main(String[] main) {
        Data d = new Data();

        d.setName("Shrinivas");
        System.out.println(d.getName());

        Data.setDescription("Coding is cool");
        System.out.println(Data.getDescription());
    }
}

/*
 * =========================
 * Getters and setters
 * =========================
 * 
 * We achieve ENCAPSULATION using getters and setters.
 * 
 * Getters and setters are used to avoid giving direct access to
 * fields/variables (both static and instance) of class, instead we get and set
 * values using methods which are called getters and setters respectively.
 * 
 * Instance fields have instance methods for getters and setters.
 * Static fields have static methods for getters and setters.
 * 
 * Getters return data.
 * Setters do not return anything.
 * 
 * If we name the parameter same as instance variable, we lose access to
 * instance variable as parameter variable is closest.
 * Therefore, we use `this` to access instance variables inside instance
 * methods. `this` refers to current instance of class.
 * `this` can be used to call another instance method from one instance method.
 */