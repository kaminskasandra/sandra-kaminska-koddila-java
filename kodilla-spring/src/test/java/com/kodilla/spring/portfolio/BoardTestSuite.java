package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        Board board = (Board) context.getBean("getBoard");

        ArrayList<String> taskToDoList = (ArrayList<String>) board.getToDoList().getTasks();
        taskToDoList.add("Task: toDoList");

        ArrayList<String> taskInProgressList = (ArrayList<String>) board.getInProgressList().getTasks();
        taskInProgressList.add("Task: inProgressList");

        ArrayList<String> taskDoneList = (ArrayList<String>) board.getDoneList().getTasks();
        taskDoneList.add("Task: doneList");

        //Then
        assertEquals("Task: toDoList", taskToDoList.get(0));
        assertEquals("Task: inProgressList", taskInProgressList.get(0));
        assertEquals("Task: doneList", taskDoneList.get(0));
    }
}