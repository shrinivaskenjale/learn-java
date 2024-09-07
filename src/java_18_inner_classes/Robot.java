package java_18_inner_classes;

public class Robot {
    private int id;

    // inner class
    class Brain {
        // inner class has access to instance variables
        void think() {
            System.out.println("Robot " + id + " thinking");
        }
    }

    // static inner class
    static class Battery {
        // no access to instance variables inside static inner class
        void charge() {
            System.out.println("Battery charging");
        }
    }

    Robot(int id) {
        this.id = id;
    }

    void start() {
        int startingTime = 323;
        System.out.println("Starting robot " + this.id);

        Brain brain = new Brain();
        brain.think();

        // inner class inside method
        // scope of this class is inside method body
        class Temp {
            // access to instance variables as well as local variables of method
            void doSomething() {
                System.out.println("Id is " + id);
                System.out.println("Starting time is " + startingTime);

            }
        }

        // accessing inner class
        Temp temp = new Temp();
        temp.doSomething();
    }
}
