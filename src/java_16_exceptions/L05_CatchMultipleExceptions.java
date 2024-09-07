package java_16_exceptions;

public class L05_CatchMultipleExceptions {

    static void testCatchMultipleException() {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testBaseException() {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        testCatchMultipleException();
        testBaseException();
    }
}

/*
 * 
 * ===============================
 * Catching multiple exceptions
 * ===============================
 * 
 * We can catch more than one type of exception in a single catch block.
 * 
 * Each exception type that can be handled by the catch block is separated using
 * a vertical bar or pipe |.
 * 
 * catch (ExceptionType1 | Exceptiontype2 ex) {}
 * 
 * =========================
 * Catching base Exception
 * =========================
 * 
 * If there is a hierarchy of exceptions in the catch block, we can catch the
 * base exception only instead of catching multiple specialized exceptions.
 * 
 * We know that all the exception classes are subclasses of the Exception class.
 * So, instead of catching multiple specialized exceptions, we can simply catch
 * the Exception class.
 * => catch (Exception e)
 * 
 * If the base exception class has already been specified in the catch block, do
 * not use child exception classes in the same catch block. Otherwise, we will
 * get a compilation error.
 * => catch (Exception | ArithmeticException e) // error
 * All exceptions in same catch should be siblings. No 2 classes should have
 * parent-child relationship.
 */