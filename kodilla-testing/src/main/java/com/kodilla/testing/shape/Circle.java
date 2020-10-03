package com.kodilla.testing.shape;

public class Circle implements Shape {
    String CircleName;
    int CircleField;

    public Circle(String circleName, int circleField) {
        CircleName = circleName;
        CircleField = circleField;
    }

    public String getCircleName() {
        return CircleName;
    }

    public void setCircleName(String circleName) {
        CircleName = circleName;
    }

    public int getCircleField() {
        return CircleField;
    }

    public void setCircleField(int circleField) {
        CircleField = circleField;
    }

    @Override
    public String getShapeName() {
        return CircleName;
    }

    @Override
    public int getField() {
        return CircleField;
    }
}
