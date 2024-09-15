package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

// Create a TestStudent class.
public class TestStudent {
    @Test
    // Create a testImplementation method that asserts
    // that a Student is an instanceof a Learner.
    public void testImplementation() {
        // given
        Student student = new Student(null, null);

        // when
        Boolean result = student instanceof Learner;

        // then
        Assert.assertTrue(result); // 'result' is always true
    }

    @Test
    // Create a testInheritance method that asserts
    // that a Student is an instanceof a Person.
    public void testInheritance() {
        // given
        Student student = new Student(null, null);

        // when
        Boolean result = student instanceof Person;

        // then
        Assert.assertTrue(result); // or true
    }

    @Test
    // Create a testLearn method that ensures a Student's totalStudyTime instance variable
    // is incremented by the specified numberOfHours by invoking the .learn method.
    public void testLearn() {
        // given
        Student student = new Student(null, null);
        Double numberOfHoursToLearn = 98.0;
        Double preStudyTime = student.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToLearn;

        // when
        student.learn(numberOfHoursToLearn);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}