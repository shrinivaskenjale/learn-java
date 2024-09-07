package java_04_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class L07_Sort {
    public static void main(String[] args) {
        // =========================================
        // Arrays.sort(arr, comparator)
        // =========================================

        // Sorts original array.

        // Comparator is optional
        // Comparator allows sorting using custom key.
        // Comparator is interface and we need to pass object of class that implements
        // this interface.

        // It is stable.

        // If returned value by compare function is:
        // 1. positive: o1 is placed after o2
        // 2. negative: o1 is placed before o2
        // 3. 0: no change is made in the order

        int[] num5 = { 4, 5, 9, 10, 6, 1, 2, 3, 7, 8 };
        Arrays.sort(num5);
        System.out.println(Arrays.toString(num5));

        // Sorting with first value of inner array as key
        int[][] num6 = { { 4, 2 }, { -1, 6 }, { 5, 2 } };

        // Using anonymous class to implement Comparator
        Arrays.sort(num6, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        System.out.println(Arrays.deepToString(num6));

        // Using lambda expressions to implement Comparator
        Arrays.sort(num6, (o1, o2) -> -Integer.compare(o1[0], o2[0]));
        System.out.println(Arrays.deepToString(num6));

    }
}

// If array elements implement Comparable then array can be sorted without
// passing Comparator to sort().