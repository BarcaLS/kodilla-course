package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String TriangleName;
    int TriangleField;

    public Triangle(String triangleName, int triangleField) {
        TriangleName = triangleName;
        TriangleField = triangleField;
    }

    public String getTriangleName() {
        return TriangleName;
    }

    public void setTriangleName(String triangleName) {
        TriangleName = triangleName;
    }

    public int getTriangleField() {
        return TriangleField;
    }

    public void setTriangleField(int triangleField) {
        TriangleField = triangleField;
    }

    @Override
    public String getShapeName() {
        return TriangleName;
    }

    @Override
    public int getField() {
        return TriangleField;
    }
}
