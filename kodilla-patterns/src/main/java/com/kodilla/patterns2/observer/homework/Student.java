package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Queue;

public class Student implements Observable {
    private final Observer observer;
    private final String studentName;
    private final Queue<String> tasks;

    public Student(Observer observer, String studentName) {
        tasks = new ArrayDeque<>();
        this.observer = observer;
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public String getStudentName() {
        return studentName;
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    @Override
    public void notifyObservers() {
        observer.update(this);
    }
}
