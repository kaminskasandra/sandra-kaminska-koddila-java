package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When list is empty,"+
    "then an empty list is returned")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("When list is filled,"+
    "then list with even numbers is returned")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> fullList = new ArrayList<>();
        fullList.add(1);
        fullList.add(2);
        fullList.add(3);
        fullList.add(4);

        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(fullList);
        ArrayList<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        System.out.println("Testing full list");

        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
