package com.xetius;

import com.xetius.shape.*;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(shapeType)) {
            return new Square();
        } else if ("triangle".equalsIgnoreCase(shapeType)) {
            return new Triangle();
        }
        return new NullShape();
    }
}
