package java_04_arrays;

import java.util.Arrays;

public class L10_BinarySearch {
    public static void main(String[] args) {
        // =========================================
        // Arrays.binarySearch(arr, key)
        // =========================================

        // Works on sorted array.
        // Returns index of key if present else returns (-(insertion point) - 1)
        // Insertion point is lower bound index of that key (index of the first element
        // greater than the key)
        // Note that this guarantees that the return value will be >= 0 if and only if
        // the key is found.

        int[] num4 = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(num4, 3);
        System.out.println(index);
    }
}
