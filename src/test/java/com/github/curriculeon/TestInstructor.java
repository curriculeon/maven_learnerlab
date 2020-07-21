package com.github.curriculeon;

/**
 * Create a TestInstructor class.
 * Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
 * Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
 * Create a testTeach method that ensures when an Instructor invokes the teach method,
 * a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
 * Create a testLecture method that ensures when an Instructor invokes the lecture method,
 * a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * Implemented by Monica Deshmukh
 * 07/21/2020
 */
public class TestInstructor {
    @Test
    public void testImplementation() {
        //given
        Instructor instructor = new Instructor(1, "Monica");

        //when
        Boolean outcome = instructor instanceof Teacher;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance() {
        //given
        Instructor instructor = new Instructor(1, "Monica");

        //when
        Boolean outcome = instructor instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public  void testTeach() {
        //given
        Instructor instructor = new Instructor(1, "Monica");
        Student student = new Student(2, "student1");
        Double expectedStudyTime = 10D;
        //when
        instructor.teach(student, expectedStudyTime);
        Double actualStudyTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(actualStudyTime, expectedStudyTime);
    }

    @Test
    public void testLecture() {
        //given
        Instructor instructor = new Instructor(11, "Monica");
        Student[] students = new Student[3];
        students[0] = new Student(1, "student1");
        students[1] = new Student(2, "student2");
        students[2] = new Student(3, "student3");
        Double initialStudyTime = 0D;

        for (Student s: students) {
            initialStudyTime +=  s.getTotalStudyTime();
        }

        Double expectedStudyTime = 10D;

        //when
        instructor.lecture(students, expectedStudyTime);

        Double actualTotalStudyTime = 0D;
        for (Student s: students) {
            actualTotalStudyTime +=  s.getTotalStudyTime();
        }
        Double actualStudyTime = (initialStudyTime + actualTotalStudyTime)/students.length;

        //then
        Assert.assertEquals(actualStudyTime, expectedStudyTime);

    }
}
