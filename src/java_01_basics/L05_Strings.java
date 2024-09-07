package java_01_basics;

public class L05_Strings {
    public static void main(String[] args) {
        String myString = "Shrinivas Kenjale";
        System.out.println(myString);

        // String concatenation
        String greeting = "Welcome " + myString;
        System.out.println(greeting);

        // Outputting variables with string
        int myInt = 69;
        System.out.println(myString + " likes " + myInt);

        // String + char = String
        String name = "shri" + 'k';
        System.out.println(name);

    }
}
