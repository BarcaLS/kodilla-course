package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Shooting", "Favorite Range", "Pickup");
            case PAINTING:
                return new PaintingTask("Kitchen", "white", "walls");
            case SHOPPING:
                return new ShoppingTask("Fruits", "bananas", 6);
            default:
                return null;
        }

    }
}
