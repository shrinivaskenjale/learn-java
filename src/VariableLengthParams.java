public class VariableLengthParams {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4));

        int[] arr = { 1, 2, 3 };
        System.out.println(add(arr));
    }

    static int add(int... nums) {
        // nums is of type int[]
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
