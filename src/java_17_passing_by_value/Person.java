package java_17_passing_by_value;

public class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
