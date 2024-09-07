package java_16_exceptions;

import java.io.FileWriter;
import java.io.PrintWriter;

public class L02_TryCatch {

    static void testTryCatch() {
        try {
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }

    static void testTryFinally() {
        try {
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);

        }

        finally {
            System.out.println("Finally block is always executed");
        }
    }

    static void testTryCatchFinally() {
        int[] list = { 5, 6, 8, 9, 2 };

        PrintWriter out = null;

        try {

            System.out.println("Entering try statement");

            // creating a new file OutputFile.txt
            out = new PrintWriter(new FileWriter("OutputFile.txt"));

            // writing values from list array to Output.txt
            for (int i = 0; i < 7; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }

        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        } finally {
            // checking if PrintWriter has been opened
            if (out != null) {
                System.out.println("Closing PrintWriter");
                // close PrintWriter
                out.close();
            }

            else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    static void testMultipleCatch() {
        int[] arr = new int[10];

        try {
            arr[10] = 11;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException => " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException => " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        testTryCatch();
        testMultipleCatch();
        testTryCatchFinally();
        testTryFinally();
    }
}

/*
 * 
 * The try...catch block in Java is used to handle exceptions and prevents the
 * abnormal termination of the program.
 * 
 * =========
 * try
 * =========
 * 
 * The try block includes the code that might generate an exception.
 * 
 * ============
 * catch
 * ============
 * 
 * The catch block includes the code that is executed when there occurs an
 * exception inside the try block.
 * 
 * For each try block, there can be zero or more catch blocks. Multiple catch
 * blocks allow us to handle each exception differently.
 * 
 * The argument type of each catch block indicates the type of exception that
 * can be handled by it.
 * 
 * =============
 * finally
 * =============
 * 
 * The finally block is always executed whether there is an exception inside the
 * try block or not.
 * 
 * It is a good practice to use finally block to include important cleanup code
 * like closing a file or connection.
 * 
 * We can use:
 * 1. try...catch
 * 2. try...finally
 * 3. try...catch...finally
 */