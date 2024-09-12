package com.github.curriculeon;

public enum Educator implements Teacher{
    instructor1 (1, "John", 0), instructor2(2, "Alice", 0), instructor3(3, "Eve", 0), instructor4(4, "Bob", 0), instructor5(5, "Jim", 0);

    private final long id;
    private final String name;
    private final double timeWorked;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    Educator(long id, String name, double timeWorked)
    {
        this.id = id;
        this.name = name;
        this.timeWorked = timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {

    }
}
