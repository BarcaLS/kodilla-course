package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Spock implements Move {
    private final String name = "Spock";
    private final List<String> toBeat;
    private final List<String> toBeBeaten;

    public Spock() {
        toBeat = new ArrayList<>();
        toBeat.add("Scissors");
        toBeat.add("Rock");

        toBeBeaten = new ArrayList<>();
        toBeBeaten.add("Paper");
        toBeBeaten.add("Lizard");
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
