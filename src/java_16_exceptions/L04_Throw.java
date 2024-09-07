package java_16_exceptions;

import java.io.IOException;

public class L04_Throw {
    static void testThrowCheckedException() throws IOException {
        throw new IOException("File not found");
    }

    static void testThrowUncheckedException() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {

        try {
            testThrowCheckedException();
            System.out.println("Rest of code in try block");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        testThrowUncheckedException();
    }
}

/*
 * 
 * ========================
 * Throwing an Exception
 * ========================
 * 
 * The throw keyword is used to explicitly throw a single exception.
 * 
 * We use the throw keyword within a method.
 * 
 * => throw <throwable object>;
 * => throw new Exception("This is error message");
 * 
 * 
 * A throwable object is an instance of class Throwable or subclass of the
 * Throwable class.
 * 
 * 
 */