package com.github.curriculeon.models;

public class Students extends People{
    private static Students INSTANCE;

    private Students() {
        add(new Student(0L, "Neely Mann"));
        add(new Student(0L, "Michal Terranova"));
        add(new Student(0L, "Bilikis"));
    }

    public static Students getInstance() {
        if (INSTANCE ==null) {
            INSTANCE = new Students();
        }
        return INSTANCE;
    }
}
