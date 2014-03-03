package com.xetius.shape;

public class NullShape implements Shape {
    @Override
    public void draw() {
        System.out.println("NullShape::draw - Unknown Shape!");
    }
}
