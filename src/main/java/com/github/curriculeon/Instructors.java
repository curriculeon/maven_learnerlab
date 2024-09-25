package com.github.curriculeon;


import java.util.List;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();


    public Instructors(){
        this.add( new Instructor(0l, "Leon"));
        this.add(new Instructor (1l,"Christel"));

    }

    @Override
    public Instructor[] toArray() {
        int arrCount = count();
        Instructor[] destinationArr = new Instructor[arrCount];
        List<Instructor> instructorList = personList;
        return instructorList.toArray(destinationArr);
    }


    public static Instructors getINSTANCE(){
        return INSTANCE;
    }
}
