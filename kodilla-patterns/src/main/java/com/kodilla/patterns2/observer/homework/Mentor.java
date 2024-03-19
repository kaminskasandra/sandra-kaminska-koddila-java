package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + ": New task from " + student.getStudentName() + "\n" +
                " (total: " + student.getTasks().size() + " task)");
        updateCount++;
    }
}
