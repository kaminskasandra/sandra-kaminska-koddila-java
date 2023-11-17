package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] numbersForTest = new int[20];
        //When
       double result = ArrayOperations.getAverage(numbersForTest);
        //Then
        assertEquals(10.5, result);
    }
}
