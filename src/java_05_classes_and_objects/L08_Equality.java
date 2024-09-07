package java_05_classes_and_objects;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    // We can override `equals()` method to compare objects with symantic logic.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // Best Practice: If you override equals(), always override hashCode() as well.
    // Ensure the hash code considers the same fields used in the equals()
    // comparison.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

}

public class L08_Equality {
    public static void main(String[] args) {
        Student p1 = new Student(3, "Shrinivas");
        Student p2 = new Student(3, "Shrinivas");
        Student p3 = new Student(6, "Brock");

        // `==` compares value of primitive data types.
        // `==` compares reference of non-primitive types.
        System.out.println(p1 == p2); // false

        // We can override `equals()` method.
        System.out.println(p1.equals(p2)); // true

        p2 = p1;

        // Now, p1 and p2 refer to same object.
        System.out.println(p1 == p2); // true
        System.out.println(p1.equals(p2)); // true

        System.out.println(p2 == p3); // false
        System.out.println(p2.equals(p3)); // false

        // Comparing strings
        String s1 = "shri";
        String s2 = "shri";

        // When initializing string in primitive fashion, if string already exists in
        // string pool, its reference is returned and no new string is created.

        // `==` works on strings because we are creating them in primitive fashion. If
        // we use `new String()` to create two strings, then it will not work.
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        s1 = new String("shri");
        s2 = new String("shri");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        // NOTE: Always use equals() for comparing strings.

    }
}

// equals() and hashCode() contract:
// https://g.co/gemini/share/b4a01300954e
