package com.github.curriculeon;

public class Student extends Person implements Learner {

    //Instance variable
    private double totalStudyTime;

    //Constructor Student takes the argument of Long and String, passes the parameters to SuperConstructor
    public Student(Long id, String name) {
        super(id, name);
    }
//Implement the method learn which takes the argument Double
    @Override
    public void learn(Double numberOfHours) {
        //increments totalStudyTime variable by specified numberOfHours argument
        this.totalStudyTime+=numberOfHours;
    }
    //Implement the method getTotalStudyTime which returns totalStudyTime instance variable
    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;

    }
}
