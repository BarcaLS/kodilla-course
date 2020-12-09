package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PapricaDecorator extends AbstractPizzaOrderDecorator {
    public PapricaDecorator(PizzaOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + paprica";
    }
}
