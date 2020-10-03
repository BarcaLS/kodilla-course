package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Scissors implements Move {
    private final String name = "Scissors";
    private final List<String> toBeat;
    private final List<String> toBeBeaten;

    public Scissors() {
        toBeat = new ArrayList<>();
        toBeat.add("Paper");
        toBeat.add("Lizard");

        toBeBeaten = new ArrayList<>();
        toBeBeaten.add("Rock");
        toBeBeaten.add("Spock");
    }

    @Override
    public String getName() {
        return name;
    }
    public List<String> getToBeat() {
        return toBeat;
    }
    public List<String> getToBeBeaten() {
        return toBeBeaten;
    }
}
