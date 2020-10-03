package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Lizard implements Move {
    private final String name = "Lizard";
    private final List<String> toBeat;
    private final List<String> toBeBeaten;

    public Lizard() {
        toBeat = new ArrayList<>();
        toBeat.add("Paper");
        toBeat.add("Spock");

        toBeBeaten = new ArrayList<>();
        toBeBeaten.add("Rock");
        toBeBeaten.add("Scissors");
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
