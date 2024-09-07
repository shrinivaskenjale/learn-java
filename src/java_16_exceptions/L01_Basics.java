package java_16_exceptions;

public class L01_Basics {

}

/*
 * 
 * 
 * 
 * ==========================
 * Java Exception hierarchy
 * ==========================
 * 
 * See picture in the package.
 * 
 * Throwable class is the root class in the hierarchy.
 * 
 * The hierarchy splits into two branches: Error and Exception.
 * 
 * 
 * ==========
 * Errors
 * ==========
 * 
 * Errors represent irrecoverable conditions such as Java virtual machine (JVM)
 * running out of memory, memory leaks, stack overflow errors, library
 * incompatibility, infinite recursion, etc.
 * 
 * E.g., OutOfMemoryError, StackOverflowError
 * 
 * Errors are usually beyond the control of the programmer and we should not try
 * to handle errors.
 * 
 * 
 * ==============
 * Exceptions
 * ==============
 * 
 * An exception is an unexpected event that occurs during program execution.
 * 
 * Exceptions can be caught and handled by the program.
 * 
 * When an exception occurs within a method, it creates an object. This object
 * is called the exception object.
 * 
 * It contains information about the exception such as the name and description
 * of the exception and state of the program when the exception occurred.
 * 
 * The exception hierarchy also has two branches: RuntimeException and
 * IOException.
 * 
 * ======================
 * RuntimeException
 * ======================
 * 
 * A runtime exception happens due to a programming error. They are also known
 * as unchecked exceptions.
 * 
 * These exceptions are not checked by compiler at compile-time so may occur
 * during run-time.
 * 
 * Some of the common runtime exceptions are:
 * => Improper use of an API - IllegalArgumentException
 * => Null pointer access - NullPointerException
 * => Out-of-bounds array access - ArrayIndexOutOfBoundsException
 * => Dividing a number by 0 - ArithmeticException
 * 
 * If it is a runtime exception, it is your fault:
 * => The NullPointerException would not have occurred if you had checked
 * whether the variable was initialized or not before using it.
 * => An ArrayIndexOutOfBoundsException would not have occurred if you had
 * tested the array index against the array bounds.
 * 
 * 
 * Usually, we don't need to handle unchecked exceptions. It's because unchecked
 * exceptions occur due to programming errors. And, it is a good practice to
 * correct them instead of handling them.
 * 
 * ============
 * IOException
 * ============
 * 
 * An IOException is also known as a checked exception.
 * 
 * They are checked by the compiler at the compile-time and the programmer is
 * prompted to handle these exceptions.
 * 
 * Some of the examples of checked exceptions are:
 * => Trying to open a file that doesn't exist results in FileNotFoundException
 * => Trying to read past the end of a file
 * 
 * 
 * ===================
 * Exception handling
 * ===================
 * 
 * Exceptions abnormally terminate the execution of a program.
 * 
 * This is why it is important to handle exceptions. Here's a list of different
 * approaches to handle exceptions in Java.
 * 1. try...catch block
 * 2. finally block
 * 3. throw and throws keyword
 * 
 * 
 */