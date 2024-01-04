package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.taskCreator(TaskFactory.PAINTING_TASK);

        //Then
        Assertions.assertEquals("Paint picture ", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.taskCreator(TaskFactory.DRIVING_TASK);

        //Then
        Assertions.assertEquals("Deliver the parcel ", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.taskCreator(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();

        //Then
        Assertions.assertEquals("Buy groceries ", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
