package java_13_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Object obj = new Object();
        String str = "India";
        obj = str;

        Shape shape = new Shape();
        Circle circle = new Circle();
        shape = circle;

        List<Shape> shapes = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();
        // shapes = circles; // Not possible

        // Wildcards

        // List of unknown (any) type
        List<?> shapes2 = new ArrayList<>();
        List<Circle> circles2 = new ArrayList<>();
        shapes2 = circles2;

        // List of subtypes of Shape and Shape itself.
        List<? extends Shape> shapes3 = new ArrayList<>();
        List<Circle> circles3 = new ArrayList<>();
        shapes3 = circles3;
        // In short, upper bound is Shape.
        // Even if Shape were a interface, we would use `extends` syntax only.

        // List of supertypes of Shape and Shape itself.
        List<? super Shape> shapes4 = new ArrayList<>();
        List<Circle> circles4 = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        // shapes4 = circles4;
        shapes4 = objects;
        // In short, lower bound is Shape.

        List<Shape> theShapes = new ArrayList<>(Arrays.asList(new Shape()));
        List<Circle> theCircles = new ArrayList<>(Arrays.asList(new Circle()));

        drawShapesV1(theShapes);
        // drawShapesV1(theCircles); // Does not work

        drawShapesV2(theShapes);
        drawShapesV2(theCircles); // Works

    }

    public static void drawShapesV1(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void drawShapesV2(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

/*
 * Generics with wildcards
 * 
 * Shape is the parent of Circle
 * List<Shape> is not the parent of List<Circle>
 */