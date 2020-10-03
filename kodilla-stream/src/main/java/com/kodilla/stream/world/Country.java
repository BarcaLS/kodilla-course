package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal PeopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return this.PeopleQuantity;
    }
}
