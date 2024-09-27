package com.github.curriculeon;

/**
 *  Test Student
 * Create a TestStudent class.
 * Create a testImplementation method that asserts that a Student is an instanceof a Learner.
 * Create a testInheritance method that asserts that a Student is an instanceof a Person.
 * Create a testLearn method that ensures a Student's totalStudyTime instance variable
 * is incremented by the specified numberOfHours by invoking the .learn method.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * Implemented By Monica Deshmukh
 * 07/20/2020
 */
public class TestStudent {
    @Test
    public void testImplementation() {
        //given a studentObject
        long id = 5;
        String name = "Monica";
        Student studentObject = new Student(id,name);

        //when a learner object could be created using a student object
        Learner learnerObject = studentObject;

        //then asserts that a student is an instance of a learner object
        Assert.assertEquals(studentObject, learnerObject);
    }

    @Test
    public void testInheritance() {
        //given a student object
        long id = 5;
        String name = "Monica";
        Student studentObject = new Student(id,name);

        //when a personObject could be created using a studentObject
        Person personObject = studentObject;

        //then asserts that a student is an instance of a person
        Assert.assertEquals(studentObject, personObject);
    }

    @Test
    public void testLearn(){
        //given a student object
        long id = 5;
        String name = "Monica";
        Student student = new Student(id, name);
        Double initialStudyHours = student.getTotalStudyTime();
        double expectedStudyHours = 10;
        //when
        student.learn(expectedStudyHours);
        Double actualStudyTime = initialStudyHours + student.getTotalStudyTime();
        //then
        Assert.assertEquals((Double)expectedStudyHours,actualStudyTime);
    }


}
