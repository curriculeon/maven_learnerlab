package com.github.curriculeon;
import java.util.List;

public class Instructors extends People<Instructor> {

    private static final Instructors instance = new Instructors();

    private Instructors() {

        this.add(new Instructor(0L, "Professor Peep"));
        this.add(new Instructor(0L, "Professor George"));
    }

    @Override
    public Instructor[] toArray() {
        int sizeOfArray = count();
        Instructor[] destinationArray = new Instructor[sizeOfArray];
        List<Instructor> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

    public static Instructors getInstance() {
        return instance;
    }


}

