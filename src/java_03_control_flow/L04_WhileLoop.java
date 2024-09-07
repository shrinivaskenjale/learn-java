package java_03_control_flow;

public class L04_WhileLoop {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10) {
            System.out.println(num);
            num += 1;
        }
    }
}

// The for loop is used when the number of iterations is known.

// while and do...while loops are generally used when the number of iterations
// is unknown.