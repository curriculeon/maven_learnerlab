package com.github.curriculeon;


// Create an Instructor class such that:
    //Instructor is a subclass of Person
    //Instructor implements the Teacher interface
public class Instructor extends Person implements Teacher {

    // create 'Instructor' constructor
    public Instructor(Long id, String name) {
        super(id, name);
    }

// Instructor should have a concrete implementation of the teach method
// which invokes the learn method on the specified Learner object.
    @Override
    public void teach(Learner learner, Double numberOfHours) {
    learner.learn(numberOfHours);
}

//Instructor should have a concrete implementation of the lecture method
// which invokes the learn method on each of the elements in the specified array of Learner objects.
        // numberOfHours should be evenly split amongst the learners.
        // double numberOfHoursPerLearner = numberOfHours / learners.length;
    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
    double numberOfHoursPerLearner = numberOfHours / learners.length;
    for (int i = 0; i < learners.length; i++) {
        Learner learner = learners[i];
        learner.learn(numberOfHoursPerLearner);
    }
}





}