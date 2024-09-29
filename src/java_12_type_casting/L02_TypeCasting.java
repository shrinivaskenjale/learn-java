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

public class L02_TypeCasting {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        Camera cam1 = new Camera();

        mach1.start();
        cam1.start();
        cam1.capture();

        // ============================================
        // Upcasting: Child to Parent (Polymorphism) (SAFE)
        // Widening = Implicit
        // ============================================

        Machine mach2 = cam1; // Implicit
        mach2.start();
        // mach2.capture(); // not accessible

        // ============================================
        // Downcasting: Parent to Child (UNSAFE)
        // Narrowing = Explicit
        // ============================================

        // 1. This works
        Machine mach3 = new Camera();
        Camera cam2 = (Camera) mach3; // Explicit
        cam2.start();
        cam2.capture();
        // Actual object was Camera and you are converting it back to same type

        // 2. This does not work (Runtime exception)
        Machine mach4 = new Machine();
        Camera cam3 = (Camera) mach4;
        cam3.start();
        // Actual object was not camera so trying to convert it to Camera will fail.

        // When original type of object is unknown, it is better to use instanceof
        // operator before typecasting to avoid exception.
        if (mach4 instanceof Camera) {
            Camera cam4 = (Camera) mach4;
            cam4.start();
        }
    }

}
