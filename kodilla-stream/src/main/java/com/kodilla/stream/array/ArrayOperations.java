package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    int[] numbers = new int[20];
     static double getAverage(int[] numbers) {

             IntStream.range(1, numbers.length + 1)
                     .forEach(System.out::println);

         OptionalDouble result = IntStream.range(1, numbers.length + 1)
                 .average();
         return result.getAsDouble();
     }
}
