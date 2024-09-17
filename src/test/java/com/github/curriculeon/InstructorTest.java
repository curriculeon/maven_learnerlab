package com.github.curriculeon;
/*
Create a TestInstructor class.
Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
Create a testTeach method that ensures when an Instructor invokes the teach method,
a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method,
 a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
 */

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    private void testImplementation(boolean tru) {
        // Given
        Instructor instructor = new Instructor(2,"B.M.Quickly");


        // Then
        Assert.assertTrue(instructor instanceof Instructor);

    }

    private void testInheritance(boolean tru) {
        // Given
        Person student = new Student(2,"B.M.Quickly");


        // Then
        Assert.assertTrue(student instanceof Person);

    }

    private void testTeach(boolean tru) {
        // Given
        Teacher instructor = new Instructor(2,"B.M.Quickly");
        Learner student = new Student(1,"Carlos");
        Double expected= 4.0;

        //When
        instructor.teach(student,expected);
        Double actual=student.getTotalStudyTime();


        // Then

        Assert.assertEquals(actual,expected);
    }

    private void testLecture(boolean tru) {
        // Given
        Teacher instructor = new Instructor(2,"B.M.Quickly");
        Learner student1 = new Student(1,"Carlos");
        Learner student2 = new Student(20,"James");
        Learner student3 = new Student(21,"Smasher");
        Learner student4 = new Student(22,"Jesse");
        Learner[] learnerz = new Learner[]{student1,student2,student3,student4};

        Double expected= 4.0;

        //When
        instructor.lecture(learnerz,expected);
        Double actual1=student1.getTotalStudyTime();
        Double actual2=student2.getTotalStudyTime();
        Double actual3=student3.getTotalStudyTime();
        Double actual4=student4.getTotalStudyTime();


        // Then

        Assert.assertEquals(actual1,expected);
        Assert.assertEquals(actual2,expected);
        Assert.assertEquals(actual3,expected);
        Assert.assertEquals(actual4,expected);

    }


    @Test
    public void test1() {
        testImplementation(true);
    }

    @Test
    public void test2()
    {testLecture(true);}

    @Test
    public void test3(
    ){
        testInheritance(true);
    }

    @Test
    public void test4(
    ){
        testTeach(true);
    }


}

