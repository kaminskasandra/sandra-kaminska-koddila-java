package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();


    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapeList.size() && n >= 0) {
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {

            StringBuilder result = new StringBuilder();
            for (Shape shape : shapeList) {
                result.append(shape.getShapeName()).append(" ");
            }
            return result.toString();
        }
    }

