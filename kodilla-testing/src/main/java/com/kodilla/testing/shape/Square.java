package com.kodilla.testing.shape;

public class Square implements Shape{

    private double a;
    public Square(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        double field = a*a;
        return field;
    }
}
