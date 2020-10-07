package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    public static final String WITH_SESAME = "with sesame";
    public static final String WITHOUT_SESAME = "without sesame";
    public static final String STANDARD = "with standard sauce";
    public static final String ISLANDS = "with 1000 islands sauce";
    public static final String BARBECUE = "with barbecue sauce";
    public static final String SALAD = "salad";
    public static final String ONION = "onion";
    public static final String BEACON = "beacon";
    public static final String CUCUMBER = "cucumber";
    public static final String CHILLI = "chilli";
    public static final String MUSHROOMS = "mushrooms";
    public static final String PRAWNS = "prawns";
    public static final String CHEESE = "cheese";

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    private BigMac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}