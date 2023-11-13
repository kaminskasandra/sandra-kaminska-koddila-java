package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("When addFigure is trigged, "+
            "then figure is added to the collection")
    class ShapeTests {
        @Test
        public void testAddFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            //When
            shapeCollector.addFigure(shape);
            //Then
            assertEquals(1, shapeCollector.getShapeList().size());
        }

        @DisplayName("When removeFigure is trigged," +
                "then figure is removed from the collection")
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapeList().size());
        }

        @DisplayName("When getFigure is trigged," +
                "then then the figure is returned")
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(7);
            //When
            Shape shapeTest = shapeCollector.getFigure(0);
            //Then
            assertEquals(null, shapeTest);
        }

        @DisplayName("When showFigures is trigged" +
                "then figures are showed as a String")
        @Test
        public void testShowFigures() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            Shape testShape = new Square(7);
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(testShape);
            //When
            String shapes = shapeCollector.showFigures();
            //Then
            assertEquals("Circle " + "Square ", shapes);
        }
    }
}
