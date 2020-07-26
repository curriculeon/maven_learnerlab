package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    //Create a testImplementation method that asserts that a Student
    // is an instanceof a Learner.
    @Test
    public void testImplementation() {
        //given
        Student student = new Student(null, null);

        //when
        Boolean result = student instanceof Learner;

        //then
        Assert.assertTrue(result);
    }

    //Create a testInheritance method that asserts that a Student is an
    // instanceof a Person.
    @Test
    public void testInheritance() {
        //given
        Student student = new Student(null, null);

        //when
        Boolean result = student instanceof Person;

        //then
        Assert.assertTrue(result);

    }

    //Create a testLearn method that ensures a Student's totalStudyTime
    // instance variable is incremented by the specified numberOfHours
    // by invoking the .learn method.
    @Test
    public void testLearn() {
        //given
        Student student = new Student(null,null);
        Double numberOfHours = 98.0;
        Double preStudyTime = student.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHours;

        //when
        student.learn(numberOfHours);
        Double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual, 0.01);

    }

}
