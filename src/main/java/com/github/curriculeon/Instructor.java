package com.github.curriculeon; //package is a grouping of related classes and interfaced; prevents naming conflicts

public class Instructor extends Person implements Teacher{ //Instructor is child of Person
    public Instructor(Long id, String name) { //Long id and String name are the 2 params
        super(id, name); //super is used to call a nonparameterless constructor in Parent (Person) class
    }
    @Override //new version of method in child class
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }
    @Override //new version of method in child class
    public void lecture(Learner[] learners, Double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            learner.learn(numberofHoursPerLearner);
        }
    }
}
