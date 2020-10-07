package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    void testBigMacBuilder() {
        //Given
        BigMac bigBigBigMac = new BigMac.BigMacBuilder()
                .bun(BigMac.WITH_SESAME)
                .burgers(4) // oh yeah (I know I shouldn't comment here)
        .sauce(BigMac.STANDARD)
                .ingredients(BigMac.BEACON)
                .ingredients(BigMac.SALAD)
                .ingredients(BigMac.BEACON)
                .ingredients(BigMac.ONION)
                .ingredients(BigMac.BEACON)
                .build();
        System.out.println(bigBigBigMac.toString());

        //When
        String bun = bigBigBigMac.getBun();
        int burgers = bigBigBigMac.getBurgers();
        String sauce = bigBigBigMac.getSauce();
        int howManyIngredients = bigBigBigMac.getIngredients().size();

        //Then
        assertEquals(BigMac.WITH_SESAME, bun);
        assertEquals(4, burgers);
        assertEquals(BigMac.STANDARD, sauce);
        assertEquals(5, howManyIngredients);
    }
}
