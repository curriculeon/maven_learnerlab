package com.github.curriculeon;
/*
    Interfaces do not implement their own methods, they only provide the signature and final variables.
    Classes that use the interface must implement the methods on their own.
 */
public interface Learner {
    public void learn(double numberOfHours);
    public Double getTotalStudyTime();
}
