package java_01_basics;

public class L08_Characters {
    public static void main(String[] args) {

        // Get unicode value for character
        System.out.println((int) 'A'); // 65

        // Get character for unicode value
        System.out.println((char) 65); // 'A'

        // Implicit conversion
        char a = 97;
        System.out.println(a); // 'a'

        // Implicit conversion
        int b = 'b';
        System.out.println(b); // 98

    }
}

/*
 * 
 * In java, characters are stored using Unicode, which is a universal character
 * encoding standard.
 * 
 * ASCII represents only 128 characters.
 * ASCII can be considered a subset of Unicode.
 * 
 * The first 128 characters in Unicode correspond exactly to the ASCII
 * characters, with the same decimal values.
 */