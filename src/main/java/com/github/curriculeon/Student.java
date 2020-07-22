package com.github.curriculeon;

public class Student extends Person implements Learner {
    private Double totalStudyTime = 0.0;

    public Student(){
        super();
    }
    public Student(Long id, String name){
        super(id, name);
    }

    public Student(Double numOfHours){
        super();
        learn(numOfHours);
    }
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }


    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
