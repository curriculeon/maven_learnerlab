package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        Assert.assertTrue(new Student(0L, null) instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(new Student(0L, null) instanceof Person);
    }

    @Test
    public void testLearn() {
        // given
        Student student = new Student(null, null);
        Double numberOfHoursToLearn = 10.0;
        Double preStudyTime = student.getTotalStudyTime();
        Double postStudyTime = preStudyTime + numberOfHoursToLearn;

        // when
        student.learn(numberOfHoursToLearn);

        // then
        Assert.assertEquals(postStudyTime, student.getTotalStudyTime());
    }
}
