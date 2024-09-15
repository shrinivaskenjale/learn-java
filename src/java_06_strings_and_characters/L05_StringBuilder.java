package java_06_strings_and_characters;

public class L05_StringBuilder {
    public static void main(String[] args) {
        // ======================
        // StringBuilder class
        // ======================

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

        // Getting String from StringBuilder
        System.out.println(sb.toString());

        System.out.println(sb.length());

        System.out.println(sb.charAt(0));
    }
}

/*
 * https://www.javatpoint.com/StringBuilder-class
 * 
 * StringBuffer is also similar to StringBuilder. It's a thread-safe version of
 * StringBuilder. So, StringBuilder is lightweight than StringBuffer.
 * 
 * 
 */
