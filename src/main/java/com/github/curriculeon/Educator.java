package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON(1, "Leon"),
    ALI(2, "Ali"),
    LENNY(3, "Lenny");

    int id;
    String name;

    Educator(int id, String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
/*
    LEON(1, "Leon"),
    ALI(2, "Ali"),
    LENNY(3, "Lenny");

    int id;
    String name;

    Educator(int id, String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 */
}
