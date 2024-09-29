package java_14_anonymous_classes;

class Machine {
    void start() {
        System.out.println("machine started");
    }

    void stop() {
        System.out.println("machine stopped");
    }
}

interface Plant {
    void grow();
}

public class App {
    public static void main(String[] args) {
        // =================================================
        // Use case 1: Extending existing class on the fly
        // =================================================

        // This class is child of Machine class.
        // We can override methods that we want and more.

        Machine camera = new Machine() {
            @Override
            void start() {
                showInfo();
                System.out.println("Camera started");
            }

            // New methods can only be accessed inside {}
            void showInfo() {
                System.out.println("This is a camera");
            }
        };

        camera.start();
        camera.stop();
        // camera.showInfo(); // Not accessible

        // ====================================================
        // Use case 2: Implementing the interface on the fly
        // ====================================================

        // Instantiating a class that implements the interface
        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant grew");
            }
        };

        plant.grow();
    }
}

/*
 * The anonymous class in Java is a way to create an unnamed class that extends
 * a superclass or implements an interface on the fly. They are often used for
 * one-time implementations or event handlers.
 */