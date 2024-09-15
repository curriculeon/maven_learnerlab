package com.github.curriculeon;

//Create a Learner interface.
public interface Learner {
    void learn(Double numberOfHours);
/*Learner should declare method signature:
                /*Method name: learn
                Method parameters: double numberOfHours
                Method return-type: void
         */

/*Learner should declare method signature:
                Method name: getTotalStudyTime
                Method return-type: Double
                */
    Double getTotalStudyTime();
}
