package java_15_lambda_expressions;

public class L3 {
    public static void main(String[] args) {
        Human human = new Human();
        makeWalk(human);

        Robot robo = new Robot();
        makeWalk(robo);

        makeWalk(new Walkable() {

            @Override
            public void walk() {
                System.out.println("Alien walking");
            }

        });

        makeWalk(() -> System.out.println("Animal walking"));

    }

    static void makeWalk(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}

interface Walkable {
    void walk();
}

class Human implements Walkable {
    public void walk() {
        System.out.println("Human walking");
    }
}

class Robot implements Walkable {
    public void walk() {
        System.out.println("Robot walking");
    }
}
