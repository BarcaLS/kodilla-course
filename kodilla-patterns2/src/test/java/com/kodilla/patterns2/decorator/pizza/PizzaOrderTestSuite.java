package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaOrderTestSuite {
    @Test
    public void testMargeritaPizzaWithCheeseWithSalamiWithPapricaGetCost() {
        // Given
        com.kodilla.patterns2.decorator.pizza.PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MargeritaPizzaOrderDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PapricaDecorator(theOrder);
        System.out.println(theOrder.getCost());
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(45), theCost);
    }

    @Test
    public void testSlawkowskaPizzaWithCheeseWithSalamiWithPapricaGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SlawkowskaPizzaOrderDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PapricaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Make a pizza Slawkowska + cheese + salami + paprica", description);
    }
}