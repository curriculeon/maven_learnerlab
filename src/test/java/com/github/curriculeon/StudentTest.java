package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/*
Create a TestStudent class.
Create a testImplementation method that asserts that a Student is an instanceof a Learner.
Create a testInheritance method that asserts that a Student is an instanceof a Person.
Create a testLearn method that ensures a Student's totalStudyTime instance variable is
incremented by the specified numberOfHours by invoking the .learn method.
 */
public class StudentTest {

        private void testImplementation(boolean tru) {
            // Given
            Learner student = new Student(2,"B.M.Quickly");


            // Then
            Assert.assertTrue(student instanceof Learner);

        }

    private void testInheritance(boolean tru) {
        // Given
        Person student = new Student(2,"B.M.Quickly");


        // Then
        Assert.assertTrue(student instanceof Person);

    }

    private void testLearn(boolean tru) {
        // Given
        Learner student = new Student(2,"B.M.Quickly");
        Double expected= 4.0;

        //When
        student.learn(expected);
        Double actual=student.getTotalStudyTime();


        // Then

        Assert.assertEquals(actual,expected);
    }


    @Test
    public void test1() {
        testImplementation(true);
    }

    @Test
    public void test2()
    {testLearn(true);}

    @Test
    public void test3(
    ){
        testInheritance(true);
    }

}