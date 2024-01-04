package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task taskCreator(final String taskClass) {
        return switch (taskClass) {
            case PAINTING_TASK -> new PaintingTask("Paint picture ", "blue", "sky");
            case SHOPPING_TASK -> new ShoppingTask("Buy groceries ", "bread", 3);
            case DRIVING_TASK -> new DrivingTask("Deliver the parcel ", "Wrocław, ul. Nyska", "car");
            default -> null;
        };
    }
}
