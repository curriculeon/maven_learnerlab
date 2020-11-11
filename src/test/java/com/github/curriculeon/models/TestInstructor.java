package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Learner;
import com.github.curriculeon.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(null, null);

        boolean outcome = instructor instanceof Teacher;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(null, null);

        boolean outcome = instructor instanceof Person;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testTeach() {

        Instructor instructor = new Instructor(null,null);
        Learner student = new Student(null, null);
        double numberOfHoursToTeach = 10;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime + numberOfHoursToTeach;

        instructor.teach(student, numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {

        Instructor instructor = new Instructor(null, null);
        Learner student1 = new Student(null, null);
        Learner student2 = new Student(null, null);
        Learner[] students = {student1, student2};
        double numberOfHoursToTeach = 2;
        double preStudyTime1 = student1.getTotalStudyTime();
        double preStudyTime2 = student2.getTotalStudyTime();
        double expected1 = preStudyTime1 + numberOfHoursToTeach/2;
        double expected2 = preStudyTime2 + numberOfHoursToTeach/2;

        instructor.lecture(students, numberOfHoursToTeach);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(expected1, actual1, 0);
        Assert.assertEquals(expected2, actual2, 0);
    }
}
