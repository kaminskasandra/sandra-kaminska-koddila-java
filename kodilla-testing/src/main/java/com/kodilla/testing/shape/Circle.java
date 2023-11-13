package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        double field = 3.14 * (r * r);
        return field;
    }
}
