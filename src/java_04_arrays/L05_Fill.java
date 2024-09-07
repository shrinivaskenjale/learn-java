package java_04_arrays;

import java.util.Arrays;

public class L05_Fill {
    public static void main(String[] args) {
        // =========================================
        // Arrays.fill(arr, value)
        // =========================================

        int[] num3 = new int[6];

        // Fill complete array
        Arrays.fill(num3, 9);
        System.out.println(Arrays.toString(num3));

        // =================================================
        // Arrays.fill(array, start index, end index, value)
        // =================================================

        // Specifying start index and end index(not included)
        Arrays.fill(num3, 1, 3, 5);
        System.out.println(Arrays.toString(num3));

        // =====================================
        // Filling multi-dimensional arrays
        // =====================================

        int[][][] arr3d = new int[3][4][5];
        for (int[][] x : arr3d) {
            for (int[] y : x) {
                Arrays.fill(y, -1);
            }
        }
        System.out.println(Arrays.deepToString(arr3d));
    }
}

/*
 * 
 * For array of reference types, value can be `null`.
 * 
 * ============================
 * Arrays.fill(array, value)
 * ============================
 * 
 * This version fills entire array with given value.
 * 
 * 
 * =================================================
 * Arrays.fill(array, start index, end index, value)
 * =================================================
 * 
 * This version fills portion of the array from start index (inclusive) till end
 * index (exclusive).
 */