package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {
    @Test
    void testTaskUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        Student student1 = new Student(mentor1,"Karol");
        Student student2 = new Student(mentor2, "Karolina");
        Student student3 = new Student(mentor1, "Mateusz");
        //When
        student1.addTask("task 1");
        student1.addTask("task 2");
        student1.addTask("task 3");
        student2.addTask("task 1");
        student3.addTask("task 1");
        student3.addTask("task 2");
        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());

        }
}
