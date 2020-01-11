package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        //given
        Student student = new Student(3, "Jack");
        //when
        Boolean isInstanceOfLearner = student instanceof Learner;
        // then
        Assert.assertTrue(isInstanceOfLearner);
    }

    @Test
    public void testInheritance() {
        //given
        Student student = new Student(3, "Jack");
        //when
        Boolean isInstanceOfPerson = student instanceof Person;
        // then
        Assert.assertTrue(isInstanceOfPerson);
    }
    @Test
    public void testLearn() {
        //given
        Student student = new Student(3, "Jack");
        double currentTotalStudyTime = student.getTotalStudyTime();
        //when
        student.learn(100);
        double expected = currentTotalStudyTime+100;
        double actual = student.getTotalStudyTime();
        // then
        Assert.assertEquals(expected, actual, 1);
    }

}
