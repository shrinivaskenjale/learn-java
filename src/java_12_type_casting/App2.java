package java_12_type_casting;

class Machine {
    void start() {
        System.out.println("machine started");
    }
}

class Camera extends Machine {
    @Override
    void start() {
        System.out.println("camera started");
    }

    void capture() {
        System.out.println("photo captured");
    }
}

public class App2 {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        Camera cam1 = new Camera();

        mach1.start();
        cam1.start();
        cam1.capture();

        // ============================================
        // Upcasting: Child to Parent (Polymorphism) (SAFE)
        // ============================================
        Machine mach2 = cam1; // Implicit
        mach2.start();
        // mach2.capture(); // not accessible

        // ============================================
        // Downcasting: Parent to Child (UNSAFE)
        // ============================================

        // 1. This works
        Machine mach3 = new Camera();
        Camera cam2 = (Camera) mach3; // Explicit
        cam2.start();
        cam2.capture();

        // 2. This does not work (Runtime exception)
        Machine mach4 = new Machine();
        Camera cam3 = (Camera) mach4;
        cam3.start();

    }

}
