package java_04_arrays;

import java.util.Arrays;

public class L06_CopyArray {
    public static void main(String[] args) {
        // ===========================================
        // Arrays.copyOf(array, new size)
        // ===========================================

        // Returns the shallow copy of given array with given size.

        // If the original array contains references to objects, the references are
        // copied, not the objects themselves.

        // A. If new size is more than original, the new array is padded with the
        // default value for the array’s type.

        // B. If new size is less than original, the new array is truncated to the
        // specified length.

        String[] fruits = { "apple", "banana", "cherry" };
        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        System.out.println(Arrays.toString(fruits));
        fruits[fruits.length - 1] = "mango";
        System.out.println(Arrays.toString(fruits));

        // ============================================
        // Arrays.copyOfRange(arr, fromIndex, toIndex)
        // ============================================

        // Returns the shallow copy of the given array from start index (inclusive) till
        // end index (exclusive).

        String[] subFruits = Arrays.copyOfRange(fruits, 1, 3);
        System.out.println(Arrays.toString(subFruits));

        // If to index is greater than last index of array then array of size (to -
        // from) is returned padded with default value of data type at the end.
    }
}
