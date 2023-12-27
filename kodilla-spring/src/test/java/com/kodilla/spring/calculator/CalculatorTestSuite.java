package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.add(2.5, 3.5);
        calculator.sub(10.1, 8.4);
        calculator.mul(14.0, 2.0);
        calculator.div(50.0, 10.0);
        //Then
    }
}
