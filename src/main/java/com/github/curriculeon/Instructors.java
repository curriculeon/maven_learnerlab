package com.github.curriculeon;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Instructors extends People <Instructor> {
    final static Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor instructor1 = new Instructor(1, "Leon");
        Instructor instructor2 = new Instructor(2, "Haseeb");

        this.add(instructor1);
        this.add(instructor2);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] tempArray = new Instructor[this.count()];
        int i = 0;
        for (Instructor instructor : this) {
            tempArray[i] = instructor;
            i++;
        }
        return tempArray ;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {

    }
}
