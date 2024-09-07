package java_02_input_output;

// import Scanner class
import java.util.Scanner;

public class L02_ScannerInput {
    public static void main(String[] args) {
        // ================================
        // Create object of Scanner class
        // ================================

        Scanner sc = new Scanner(System.in);

        // string input
        System.out.println("enter string:");
        String line = sc.nextLine();
        System.out.println(line);

        // int input
        System.out.println("enter integer:");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("enter string again:");

        // Input methods wait for input only if buffer is empty.

        // Value is taken/read from the buffer till whitespace (excluding whitespace).
        // Rest of the input remains in the input buffer.
        // Exception: "nextLine()" takes/reads input till newline character (\n). Then
        // newline character is removed from the buffer.

        // If you want to use nextLine() after any other input method than nextLine(),
        // use nextLine() before taking string input so as to get rid of newline
        // character in the buffer.
        sc.nextLine();

        String line2 = sc.nextLine();
        System.out.println(line2);

        // Taking character as input
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        // close Scanner object
        sc.close();
    }
}

/*
 * ================
 * Scanner class
 * ================
 * 
 * The Scanner class of the java.util package is used to read input data from
 * different sources like input streams, files, etc.
 * 
 * Scanner class is prsent in java.util package.
 * => import java.util.Scanner;
 * 
 * 
 * ===========================
 * Creating a Scanner Object
 * ===========================
 * 
 * Read input from the input stream
 * => Scanner sc1 = new Scanner(InputStream input);
 * 
 * Read input from files
 * => Scanner sc2 = new Scanner(File file);
 * 
 * Read input from a string
 * => Scanner sc3 = new Scanner(String str);
 * 
 * =============================
 * Reading input from keyboard
 * =============================
 * 
 * => Scanner sc = new Scanner(System.in);
 * 
 * We created an object of Scanner named sc.
 * 
 * The System.in parameter is used to take input from the standard input. It
 * works just like taking inputs from the keyboard.
 * 
 * =====================================
 * Java Scanner Methods to Take Input
 * =====================================
 * 
 * => nextInt() - reads an int value from the user
 * => nextFloat() - reads a float value form the user
 * => nextBoolean() - reads a boolean value from the user
 * => nextLine() - reads a line of text from the user
 * => next() - reads a word from the user
 * => nextByte() - reads a byte value from the user
 * => nextDouble() - reads a double value from the user
 * => nextShort() - reads a short value from the user
 * => nextLong() - reads a long value from the user
 * => nextBigInteger() - reads the big integer value from the user
 * => nextBigDecimal() - reads the big decimal value from the user
 * 
 * There is no method as nextChar() for reading character input. Use
 * "next().charAt(0)" instead.
 * 
 * ===================================
 * java.util.InputMismatchException
 * ===================================
 * 
 * If token doesn't match the data type expected by method,
 * java.util.InputMismatchException is thrown.
 * 
 * =========================
 * Working of Java Scanner
 * =========================
 * 
 * The Scanner class reads an entire line and divides the line into tokens.
 * Tokens are small elements that have some meaning to the Java compiler.
 * 
 * Suppose there is an input string:
 * He is 22
 * 
 * In this case, the scanner object will read the entire line and divides the
 * string into tokens: "He", "is" and "22". The object then iterates over each
 * token and reads each token using its different methods.
 * 
 * Note: By default, whitespace is used to divide tokens.
 * 
 * =============
 * Notes
 * =============
 * 
 * Newline also is a white space.
 * 
 * All input methods except "nextLine()",
 * a. ignore the white space before the value.
 * b. ignore the newline character at the end.
 * 
 * It is better to use sc.nextLine() after nextXxx() - excluding sc.nextLine().
 * 
 * 
 * ==================
 * Checking methods
 * ==================
 * 
 * sc.hasNext()
 * sc.hasNextLine()
 * ...
 */
