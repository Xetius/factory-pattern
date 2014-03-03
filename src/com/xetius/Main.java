package com.xetius;

import com.xetius.shape.Shape;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        Shape shape2 = factory.getShape("Square");
        Shape shape3 = factory.getShape("Triangle");
        Shape shape4 = factory.getShape("Pentagon");

        List<Shape> shapes = Arrays.asList(shape1, shape2, shape3, shape4);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
