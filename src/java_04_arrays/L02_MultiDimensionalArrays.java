package java_04_arrays;

public class L02_MultiDimensionalArrays {
    public static void main(String[] args) {
        // Multi-dimensional arrays are arrays of arrays.
        // Arrays at same level can be of different lengths.

        // 2D array
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // Accessing elements
        System.out.println(grid[1][1]);

        // Iterating with for loop
        System.out.println("for loop");
        for (int i = 0; i < grid.length; i += 1) {
            for (int j = 0; j < grid[i].length; j += 1) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // Iterating with for-each loop
        System.out.println("for-each loop");
        for (int[] arr : grid) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // First dimension is compulsory to declare when creating array
        String[][][] names = new String[4][][];
        System.out.println(names[0]);
        names[0] = new String[3][];
        System.out.println(names[0][0]);
        names[0][0] = new String[7];
        System.out.println(names[0][0][0]);

    }
}
