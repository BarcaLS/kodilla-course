package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Paper implements Move {
    private final String name = "Paper";
    private final List<String> toBeat;
    private final List<String> toBeBeaten;

    public Paper() {
        toBeat = new ArrayList<>();
        toBeat.add("Rock");
        toBeat.add("Smock");

        toBeBeaten = new ArrayList<>();
        toBeBeaten.add("Scissors");
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
