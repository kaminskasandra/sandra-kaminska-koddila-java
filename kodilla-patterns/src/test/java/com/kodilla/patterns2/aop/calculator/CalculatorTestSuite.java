package com.kodilla.patterns2.aop.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Import(value = {com.kodilla.patterns2.aop.calculator.Calculator.class, com.kodilla.patterns2.aop.calculator.Watcher.class})
class CalculatorTestSuite {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        double result = calculator.add(10, 15);
        //Then
        LOGGER.info("Testing add method");
        assertEquals(25, result);
    }
    @Test
    void testSub() {
        //Given
        //When
        double result = calculator.sub(10, 15);
        //Then
        LOGGER.info("Testing sub method");
        assertEquals(-5, result, 0);
    }
    @Test
    void testMul() {
        //Given
        //When
        double result = calculator.mul(10, 15);
        //Then
        LOGGER.info("Testing mul method");
        assertEquals(150, result, 0);
    }
    @Test
    void testDiv() {
        //Given
        //When
        double result = calculator.div(15, 5);
        //Then
        LOGGER.info("Testing div method");
        assertEquals(3, result, 0);
    }
    @Test
    public void testFactorial() {
        //Given
        //When
        BigDecimal result = calculator.factorial(new BigDecimal("1000"));
        //Then
        LOGGER.info("Testing factorial method");
        System.out.println(result);
        assertTrue(BigDecimal.ONE.compareTo(result) < 0);
    }
}