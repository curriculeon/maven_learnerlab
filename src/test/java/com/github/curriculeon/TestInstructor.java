package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        // given
        Instructor instructor = new Instructor(null, null);

        // when
        boolean outcome = instructor instanceof Teacher;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance() {
        // given
        Instructor instructor = new Instructor(null, null);

        // when
        boolean outcome = instructor instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testTeach() {
        // given
        Instructor instructor = new Instructor(null, null);
        Learner student = new Student(null, null);
        double numberOfHoursToTeach = 10;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime + numberOfHoursToTeach;

        // when
        instructor.teach(student, numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLecture() {
        // given
        Instructor instructor = new Instructor(null, null);
        Learner student1 = new Student(null, null);
        Learner student2 = new Student(null, null);
        Learner[] students = {student1, student2};
        double numberOfHoursToTeach = 100;
        double preStudyTime1 = student1.getTotalStudyTime();
        double preStudyTime2 = student2.getTotalStudyTime();
        double expected1 = (preStudyTime1 + numberOfHoursToTeach) / students.length;
        double expected2 = (preStudyTime2 + numberOfHoursToTeach) / students.length;

        // when
        instructor.lecture(students, numberOfHoursToTeach);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        // then
        Assert.assertEquals(expected1, actual1, 0.01);
        Assert.assertEquals(expected2, actual2, 0.01);
    }
}
