package com.github.curriculeon;

// Create a Teacher interface.
public interface Teacher {
        /*Teacher should declare a teach method signature:
        Method name: teach
        Method parameters:
        Learner learner
        double numberOfHours
        Method return-type: void
         */
        void teach(Learner learner, Double numberOfHours);

        /* Teacher should declare a lecture method signature:
        Method name: lecture
        Method parameters:
        Learner[] learners
        double numberOfHours
        Method return-type: void
         */
        void lecture(Learner[] learners, Double numberOfHours);
}
