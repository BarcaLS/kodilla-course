package com.kodilla.rps;

public enum ComputerChancesPercentage {
    LOOSE(25),
    DRAW(50);

    final int level;

    ComputerChancesPercentage(int level) {
        this.level = level;
    }
}
