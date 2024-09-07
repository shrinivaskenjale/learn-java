public class StaticBlock {

}

class Main {
    static int k;
    static {
        // Runs when class is loaded in the memory
        System.out.println("Hello from static");
        k = 45;
    }

    public static void main(String[] args) {
        System.out.println("Hello from main");
        System.out.println(k);
    }

}
