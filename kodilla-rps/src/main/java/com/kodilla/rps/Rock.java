package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Rock implements Move {
    private final String name = "Rock";
    private final List<String> toBeat;
    private final List<String> toBeBeaten;

    public Rock() {
        toBeat = new ArrayList<>();
        toBeat.add("Scissors");
        toBeat.add("Lizard");

        toBeBeaten = new ArrayList<>();
        toBeBeaten.add("Paper");
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
