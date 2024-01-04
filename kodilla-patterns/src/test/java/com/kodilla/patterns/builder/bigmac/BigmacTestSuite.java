package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void testBigMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame seeds")
                .sauce("barbecue")
                .burgers(2)
                .ingredient("cheese")
                .ingredient("bacon")
                .ingredient("onion")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(4, howManyIngredients);
    }
}
