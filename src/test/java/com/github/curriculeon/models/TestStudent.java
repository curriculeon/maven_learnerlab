package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Student student = new Student(null, null);

        boolean outcome = student instanceof Learner;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(null, null);

        boolean outcome = student instanceof Person;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testLearn() {
        Student student = new Student(null, null);
        Double numberOfHoursToLearn = 10.0;
        Double preStudyTime = student.getTotalStudyTime();
        Double postStudyTime = preStudyTime + numberOfHoursToLearn;

        student.learn(numberOfHoursToLearn);

        Assert.assertEquals(postStudyTime, student.getTotalStudyTime());
    }
}
