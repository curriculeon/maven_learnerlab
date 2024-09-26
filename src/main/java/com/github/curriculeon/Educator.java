package com.github.curriculeon;

public enum Educator implements Teacher {
    LEON(new Instructor(0, "Leon"),0.0),
    ALI(new Instructor(1,"Ali"),0.0),
    LENNY(new Instructor(2,"Lenny"),0.0);
    private   Double timeWorked;
    private final Instructor instructor;
    Educator(Instructor instructor, Double timeWorked){
        this.instructor=instructor;
        this.timeWorked=timeWorked;
    }


    public void addTimeWorked(Double timeWorked){
      this.timeWorked+=timeWorked;
    }

    // getter for instructor
    public Instructor getInstructor(){
        return this.instructor;
    }
    // getter for instructor
    public Double getTimeWorked(){
        return this.timeWorked;
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.addTimeWorked(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner l: learners){
            l.learn(numberOfHoursPerLearner);
        }
        this.addTimeWorked(numberOfHours);

    }
}
