package com.kodilla.rps;

import java.util.List;

public interface Move {
    String getName();
    List<String> getToBeat();
    List<String> getToBeBeaten();
}
