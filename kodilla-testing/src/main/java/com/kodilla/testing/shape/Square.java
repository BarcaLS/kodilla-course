package com.kodilla.testing.shape;

public class Square implements Shape {
    String SquareName;
    int SquareField;

    public Square(String squareName, int squareField) {
        SquareName = squareName;
        SquareField = squareField;
    }

    public String getSquareName() {
        return SquareName;
    }

    public void setSquareName(String squareName) {
        SquareName = squareName;
    }

    public int getSquareField() {
        return SquareField;
    }

    public void setSquareField(int squareField) {
        SquareField = squareField;
    }

    @Override
    public String getShapeName() {
        return SquareName;
    }

    @Override
    public int getField() {
        return SquareField;
    }
}
