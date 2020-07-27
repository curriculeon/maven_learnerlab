package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        //Given

        Instructor instructor = new Instructor(0L, "some Name");

        // When
        boolean assertion = instructor instanceof Teacher;

        // Then
        Assert.assertTrue(assertion);

    }

    @Test
    public void testInheritance() {
        //Given

        Instructor instructor = new Instructor(0L, "some Name");

        // When
        boolean assertion = instructor instanceof Person;

        // Then
        Assert.assertTrue(assertion);

    }

    @Test
    public void testTeach(){
        //Given

        Instructor instructor = new Instructor(0L, "some Name");
        Student student = new Student(0L, "some student");
        Double numberOfHours = 5.5;
        Double expected = student.getTotalStudyTime()+ numberOfHours;

        // When
        instructor.teach(student, numberOfHours);
        Double actual = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture (){
        //Given

        Instructor instructor = new Instructor(0L, "some Name");

        Student[] students = {  new Student(0L, "Chris"),
                                new Student(0L, "Chris"),
                                new Student(2L, "william")};

        Double numberOfHours = 12.0;

        // When
        instructor.lecture(students, numberOfHours);

        Double expected = numberOfHours/students.length;
        for (int i = 0; i < students.length ; i++) {
            Double actual = students[i].getTotalStudyTime();
            // Then
            Assert.assertEquals(expected, actual, 0);
        }



    }

}
