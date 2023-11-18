package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] numbersForTest = {4,5,8,10,3,11,7,8,4,9,1,15,3,10,12,17,7,8,1,2};

        //When
       double averageResult = ArrayOperations.getAverage(numbersForTest);

        //Then
        assertEquals(7.25, averageResult);
    }
}
