package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza + extra cheese", description);
    }
    @Test
    public void testPepperoniGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testPepperoniGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza + pepperoni", description);
    }
    @Test
    public void testPepperoniWithExtraCheeseGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }
    @Test
    public void testPepperoniWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String descritpion = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza + pepperoni + extra cheese", descritpion);
    }
    @Test
    public void testPepperoniWithExtraCheeseWithGarlicSauceGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(31), theCost);
    }
    @Test
    public void testPepperoniWithExtraCheeseWithGarlicSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza + pepperoni + extra cheese + garlic sauce", description);
    }
}
