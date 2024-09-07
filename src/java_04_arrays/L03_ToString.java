package java_04_arrays;

import java.util.Arrays;

public class L03_ToString {
    public static void main(String[] args) {
        // =======================
        // Arrays.toString(arr)
        // =======================

        // Returns a string representation of the array.

        int[] arr1 = { 4, 5, 9, 10, 6, 1, 2, 3, 7, 8 };
        System.out.println(Arrays.toString(arr1));

        // ==========================
        // Arrays.deepToString(arr)
        // ==========================

        // Returns a string representation of the mulit-dimensional array.

        int[][] arr2 = { { 4, 2 }, { -1, 6 }, { 5, 2 } };
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.toString(arr2));
    }
}
