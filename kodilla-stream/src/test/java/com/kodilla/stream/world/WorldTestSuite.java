package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("37750000")));
        europe.addCountry(new Country("Spain", new BigDecimal("59110000")));
        europe.addCountry(new Country("Italy", new BigDecimal("83200000")));
        europe.addCountry(new Country("Croatia", new BigDecimal("3899000")));
        world.addContinents(europe);

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("Indonesia", new BigDecimal("273800000")));
        asia.addCountry(new Country("China", new BigDecimal("1412000000")));
        asia.addCountry(new Country("Thailand", new BigDecimal("71600000")));
        asia.addCountry(new Country("India", new BigDecimal("1408000000")));
        world.addContinents(asia);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3349359000");
        assertEquals(expectedPopulation, totalPopulation);
    }
}
