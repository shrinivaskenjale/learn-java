package java_06_strings;

public class L01_CreationOfString {
    public static void main(String[] args) {

        // =====================================
        // String literals
        // =====================================

        // String literals are text wrapped in double quotes.
        String firstName = "Shrinivas";
        System.out.println(firstName);

        // In Java, strings are immutable. This means once we create a string, we cannot
        // change that string.
        // For this reason following way of creating strings in inefficient.
        String info = "";
        info += "My name is Shrinivas.";
        info += " ";
        info += "I am a engineer.";
        System.out.println(info);

        // ========================================
        // Creating Strings Using the `new` Keyword
        // ========================================

        String newString = new String("Java String");
        System.out.println(newString);

        // =====================================
        // StringBuilder class
        // =====================================

        StringBuilder sb = new StringBuilder();
        sb.append("My name is John.");
        sb.append(" ");
        sb.append("I am a doctor.");

        System.out.println(sb.toString());

        // Resetting stringbuilder object length to 0
        sb.setLength(0);

        // We can chain multiple append() together
        sb.append("My name is Brock.")
                .append(" ")
                .append("I am a student.");

        System.out.println(sb.toString());

    }
}
// https://www.javatpoint.com/StringBuilder-class
// StringBuffer is also similar to StringBuilder. It's a thread-safe version of
// StringBuilder. So, StringBuilder is lightweight than StringBuffer.

// charAt(), length() work with sb

/*
 * 
 * Strings in java are immutable.
 * When we reassign value to string variable, we create new string each time.
 * 
 * =============================================
 * Create String Using Literals vs. New Keyword
 * =============================================
 * 
 * In Java, the JVM maintains a string pool to store all of its strings inside
 * the memory. The string pool helps in reusing the strings.
 * 
 * While creating strings using string literals,
 * => String example = "Java";
 * a. If the string already exists, the new string is not created. Instead, the
 * new reference, `example` points to the already existing string "Java".
 * b. If the string doesn't exist, a new string "Java" is created.
 * 
 * While creating strings using the new keyword,
 * => String example = new String("Java");
 * A new "Java" string is created even though "Java" is already present inside
 * the memory pool.
 * 
 */