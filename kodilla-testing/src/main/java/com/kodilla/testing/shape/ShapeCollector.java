package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> myList = new ArrayList<>();

    public ShapeCollector(ArrayList<Shape> myList) {
        this.myList = myList;
    }

    public boolean addFigure(Shape shape) {
        if(myList.add(shape))
            return true;
        else
            return false;
    }
    public boolean removeFigure(Shape shape) {
        if(myList.remove(shape))
            return true;
        else
            return false;
    }
    public Shape getFigure(int n) {
        return myList.get(n);
    }
    public String showFigures() {
        String figureNames = "";
        for(Shape currentShape : myList) {
            figureNames = figureNames + currentShape.getShapeName() + " ";
        }
        return figureNames;
    }
}
