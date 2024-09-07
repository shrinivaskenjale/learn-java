package java_16_exceptions;

import java.io.IOException;
import java.io.InvalidClassException;

public class L03_Throws {
    // Here, the findFile() method specifies that it can throw NullPointerException,
    // IOException, and InvalidClassException in its throws clause.
    public static void findFile() throws NullPointerException, IOException, InvalidClassException {

        // code that may produce NullPointerException
        // … … …

        // code that may produce IOException
        // … … …

        // code that may produce InvalidClassException
        // … … …
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (InvalidClassException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // We have not handled the NullPointerException. This is because it is an
        // unchecked exception. It is not necessary to specify it in the throws clause
        // and handle it.
    }
}

/*
 * 
 * ========
 * throws
 * ========
 * 
 * We use the throws keyword in the method declaration to declare the type of
 * exceptions that might occur within it.
 * 
 * We can use throws to declare multiple exceptions.
 * 
 * If a method does not handle exceptions, the type of exceptions that may occur
 * within it must be specified in the throws clause so that methods further up
 * in the call stack can handle them or specify them using throws keyword
 * themselves.
 * 
 * It is not necessary to specify unchecked exceptions (RuntimeException and
 * its subclasses) in the throws clause and handle it.
 * 
 * ======================
 * throws vs try...catch
 * ======================
 * 
 * There might be several methods that can cause exceptions. Writing try...catch
 * for each method will be tedious and code becomes long and less-readable.
 * 
 * throws is also useful when you have checked exception (an exception that must
 * be handled) that you don't want to catch in your current method.
 * 
 */