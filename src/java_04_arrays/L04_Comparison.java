package java_04_arrays;

import java.util.Arrays;

public class L04_Comparison {
    public static void main(String[] args) {
        // ===========================================
        // Arrays.equals(arr1, arr2)
        // ===========================================

        // Compares one-dimensional arrays with elements

        int[] num1 = { 1, 2, 3, 4 };
        int[] num2 = { 1, 2, 3, 4 };

        System.out.println(num1 == num2); // false
        System.out.println(Arrays.equals(num1, num2)); // true

        // ===========================================
        // Arrays.deepEquals(arr1, arr2)
        // ===========================================

        // Compares multi-dimensional arrays

        int[][] deep1 = { { 4, 2 }, { -1, 6 }, { 5, 2 } };
        int[][] deep2 = { { 4, 2 }, { -1, 6 }, { 5, 2 } };

        System.out.println(deep1 == deep2); // false
        System.out.println(Arrays.equals(deep1, deep2)); // false
        System.out.println(Arrays.deepEquals(deep1, deep2)); // true
    }
}

/*
 * The == relational operator compares references of two arrays. But sometimes
 * we want to determine whether arrays are equal or not based on elements in
 * them. In such cases, we use these methods.
 * 
 * ===========================================
 * Arrays.equals(arr1, arr2)
 * ===========================================
 * 
 * For single-dimensional arrays use equals().
 * 
 * The method returns true if the two arrays are equal, and false otherwise. Two
 * arrays are considered equal if:
 * 1. They are both null or they are both non-null.
 * 2. They have the same length.
 * 3. All corresponding pairs of elements in the two arrays are equal (using the
 * == operator for primitive types or the equals() method for objects).
 * 
 * ===========================================
 * Arrays.deepEquals(arr1, arr2)
 * ===========================================
 * 
 * For nested/multi-dimensional arrays use deepEquals().
 */