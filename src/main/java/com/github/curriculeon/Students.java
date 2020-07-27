package com.github.curriculeon;
import java.util.ArrayList;
import java.util.List;

public class Students extends People {


    private static Students INSTANCE = new Students();

    private Students() {

        this.add(new Person(0L, "Steven"));
        this.add(new Person(1L, "Greg"));
        this.add(new Person(2L, "Joe"));

    }


    public static Students getInstance() {
        return INSTANCE;
    }
}
