package com.github.curriculeon;


public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();


   public People myInstructor = new People();
    private Instructors(){
        this.add( new Instructor(01l, "Leon"));
        this.add(new Instructor (02l,"Christel"));

    }


    public static Instructors getINSTANCE(){
        return INSTANCE;
    }
}
