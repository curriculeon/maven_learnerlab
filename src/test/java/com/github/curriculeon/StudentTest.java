package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    public Boolean testImplementation() {

        Student student = new Student();
        return (student instanceof Learner);
    }

    public Boolean testInheritance() {

        Student student = new Student();
        return (student instanceof Person);
    }

    public void testLearn(Double expectedTotalStudyTime, Double actualNumberOfHours, Student student) {
        student.learn(actualNumberOfHours);
        Double actualTotalStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(actualTotalStudyTime, expectedTotalStudyTime);
    }

    @Test
    public void testLearn0() {
        Student student = new Student();
        testLearn(7D, 7D, student);
    }

    @Test
    public void testLearn1() {
        Student student = new Student(5D);
        testLearn(11D, 6D, student);
    }

    @Test
    public void testImplementation0() {
        testImplementation();
    }

    @Test
    public void testInheritance0() {
        testInheritance();
    }

}
