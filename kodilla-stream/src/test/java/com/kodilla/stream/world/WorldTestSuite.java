package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        // Given
        Country Poland = new Country(new BigDecimal(37500000));
        Country Czech = new Country(new BigDecimal(7300000));
        Country Ukraine = new Country(new BigDecimal(45900000));
        Country Liban = new Country(new BigDecimal(5300000));
        Country Egypt = new Country(new BigDecimal(54200000));
        Country Brasil = new Country(new BigDecimal(72300000));
        Country Uruguay = new Country(new BigDecimal(19400000));
        Continent Europe = new Continent();
        Continent Africa = new Continent();
        Continent southAmerica = new Continent();
        Europe.addCountry(Poland);
        Europe.addCountry(Czech);
        Europe.addCountry(Ukraine);
        Africa.addCountry(Liban);
        Africa.addCountry(Egypt);
        southAmerica.addCountry(Brasil);
        southAmerica.addCountry(Uruguay);
        World ourWorld = new World();
        ourWorld.addContinent(Europe);
        ourWorld.addContinent(Africa);
        ourWorld.addContinent(southAmerica);

        // When
        BigDecimal totalPeople = ourWorld.getPeopleQuantity();

        // Then
        BigDecimal expectedPeople = new BigDecimal("241900000");
        assertEquals(expectedPeople, totalPeople);
    }
}
