package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public final class Instructors extends People <Instructor> {
    private final static Instructors INSTANCE = new Instructors();
    private People<Instructor> instructors;

    private Instructors(){
        final Instructor leon = new Instructor(Educator.Leon.getId(),Educator.Leon.getName());
        final Instructor haseeb = new Instructor(Educator.Haseeb.getId(),Educator.Haseeb.getName());
        this.add(leon);
        this.add(haseeb);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] tempArray = new Instructor[this.instructors.count()];
        int i = 0;
        for (Instructor instructor : this) {
            tempArray[i] = instructor;
            i++;
        }
        return tempArray ;
    }
}
