package com.github.curriculeon;

/**
 * Create Teacher Interface
 *
 * Create a Teacher interface.
 * Teacher should declare a teach method signature:
 *
 * Method name: teach
 * Method parameters:
 * Learner learner
 * double numberOfHours
 * Method return-type: void
 *
 * Teacher should declare a lecture method signature:
 *
 * Method name: lecture
 * Method parameters:
 * Learner[] learners
 * double numberOfHours
 * Method return-type: void
 */

/**
 * Implemented by Monica Deshmukh
 * 07/21/2020
 */
public interface Teacher {
    void teach(Learner learner, double numberOfHours);
    void lecture(Learner[] learners, double numberOfHours);
}
