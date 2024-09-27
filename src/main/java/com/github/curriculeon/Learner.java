package com.github.curriculeon;

/**
 * Create a Learner interface.
 * Learner should declare method signature:
 * Method name: learn
 * Method parameters: double numberOfHours
 * Method return-type: void
 * Learner should declare method signature:
 * Method name: getTotalStudyTime
 * Method return-type: Double
 */

/**
 * Implemeted By Monica Deshmukh
 * 07/20/2020
 */
public interface Learner {
    public void learn (double numberOfHours);
    public Double getTotalStudyTime();
}
