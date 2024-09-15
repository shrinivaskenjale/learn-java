package java_04_arrays;

import java.util.Arrays;

public class L01_Arrays {
    public static void main(String[] args) {

        // =================
        // Create an array
        // =================

        // Integer array
        // We must provide dimension.
        int[] intArr = new int[3];

        // =========================
        // Accessing array elements
        // =========================

        intArr[0] = 23;
        intArr[1] = 67;
        intArr[2] = 99;

        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);

        // =================
        // Length of array
        // =================

        int length = intArr.length;
        System.out.println("Length of array is : " + length);

        // ===============
        // Iteration
        // ===============

        // Using for loop
        for (int i = 0; i < length; i += 1) {
            System.out.println(intArr[i]);
        }

        // Using for-each loop
        for (int val : intArr) {
            System.out.println(val);
        }

        // =================
        // Array literals
        // =================

        // Declaring and initializing array at same time using literals.
        int[] numArr = { 1, 2, 3, 4, 5 };

        for (int val : numArr) {
            System.out.println(val);
        }

        // Arrays literals can be used only when declaring and intializing together.
        // numArr = {3,4,6}; // Error

        // =========================================
        // Creating new array with initial values
        // =========================================

        int[] numArr2 = new int[] { 11, 22, 33 };
        System.out.println(Arrays.toString(numArr2));

        // func({ 1, 2, 3 }); // Does not work
        // func(new int[] { 1, 2, 3 }); // Works

        // ============
        // Example 2
        // ============

        // Array of strings
        String[] namesArr = new String[3];
        namesArr[0] = "Brock";
        namesArr[1] = "John";
        namesArr[2] = "Randy";

        for (String name : namesArr) {
            System.out.println(name);
        }

    }
}

/*
 * ===========
 * Arrays
 * ===========
 * 
 * Array is reference type.
 * 
 * An array is a collection of similar types of data.
 * Arrays are contiguous memory blocks.
 * 
 * It refers to first block of array also called base address.
 * 
 * address of element at index = base address + (index * size of block)
 * 
 * Array literal can only be used when declaring array and initializing at the
 * same time.
 * => int nums = {1,2,3}; // Works
 * => nums = {1,2,3}; // Error
 * 
 * 
 * ================
 * Default values
 * ================
 * 
 * Arrays have default values for their elements when they are created. The
 * default values depend on the type of the array:
 * 
 * 1. Numeric Types:
 * byte, short, int, long: The default value is 0.
 * float, double: The default value is 0.0.
 * 
 * 2. Char Type:
 * char: The default value is '\u0000' (the null character).
 * 
 * 3. Boolean Type:
 * boolean: The default value is false.
 * 
 * 4. Reference Types:
 * All reference types (such as objects, arrays, etc.): The default value is
 * null.
 * 
 * 
 */