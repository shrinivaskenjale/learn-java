package java_06_strings_and_characters;

public class L02_Comparison {
    public static void main(String[] args) {

        // =====================
        // Equality of strings
        // =====================

        String str1 = "Shrinivas";
        String str2 = "Shrinivas";

        String str3 = new String("Shrinivas");
        String str4 = new String("Shrinivas");

        // == compares the references
        System.out.println("str1 == str2 : " + (str1 == str2)); // true
        System.out.println("str2 == str3 : " + (str2 == str3)); // false
        System.out.println("str3 == str4 : " + (str3 == str4)); // false
        System.out.println();

        // equals() compares the values
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true
        System.out.println("str2.equals(str3) : " + str2.equals(str3)); // true
        System.out.println("str3.equals(str4) : " + str3.equals(str4)); // true
        System.out.println();

        // equalsIgnoreCase() compares the values ignoring case
        System.out.println("ABCD".equalsIgnoreCase("abcd")); // true
        System.out.println();

        // ======================
        // Comparison of strings
        // ======================

        // compareTo() compares strings alphabetically
        // s1 = s2 => 0
        // s1 < s2 => -ve
        // s1 > s2 => +ve

        // Note: A < B < ... Y < Z < a < b < ... y < z

        String s1 = "Brock";
        String s2 = "Brock";
        String s3 = "John";

        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // -8 (because s1<s3)
        System.out.println(s3.compareTo(s1)); // 8 (because s3 > s1 )
        System.out.println();

        // Use compareToIgnoreCase() to compare strings ignoring case.
        System.out.println("ABCD".compareToIgnoreCase("abcd")); // 0
        System.out.println();

        // ==========================
        // Equality of characters
        // ==========================

        char ch1 = 'a';
        char ch2 = 'a';

        System.out.println(ch1 == ch2);

        // ==========================
        // Comparison of characters
        // ==========================

        // <, > and == operators compare Unicode values of characters and return boolean

        System.out.println('a' < 'z'); // true
        System.out.println('b' > 'y'); // false

        // Note: A < B < ... Y < Z < a < b < ... y < z
        System.out.println('A' < 'a'); // true

        System.out.println();

        // Character.compare(ch1, ch2) compares Unicode value of characters and returns
        // integer value same as (ch1 - ch2):
        // ch1 = ch2 => 0
        // ch1 < ch2 => Negative integer
        // ch1 > ch2 => Positive integer

        System.out.println(Character.compare('a', 'd')); // -3
        System.out.println('a' - 'd'); // -3: Implicit subtraction of Unicodes

        System.out.println(Character.compare('a', 'a')); // 0
        System.out.println('a' - 'a'); // 0

    }
}
