package java_18_inner_classes;

public class App {
    public static void main(String[] args) {
        Robot robo1 = new Robot(7);
        robo1.start();

        // Generally we don't use inner classes outside outer classes as follows:
        Robot.Brain brain = robo1.new Brain();
        brain.think();

        // static inner class
        Robot.Battery battery = new Robot.Battery();
        battery.charge();

    }
}

// https://www.programiz.com/java-programming/nested-inner-class