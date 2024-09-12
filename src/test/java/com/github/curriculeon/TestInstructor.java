package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor();
        Learner student = new Student();
        double expectedNumberOfHours = 2.14;

        //When
        instructor.teach(student, expectedNumberOfHours);
        double actualNumberOfHours = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours, 0.1);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor();
        Learner student1 = new Student();
        Learner student2 = new Student();
        Learner student3 = new Student();
        Learner student4 = new Student();
        Learner student5 = new Student();

        Learner[] learners = {student1, student2, student3, student4, student5};
        double TotalNumberOfHours = 10.0;
        double expectedNumberOfHoursPerLearner = 10.0/learners.length;

        //When
        instructor.lecture(learners, TotalNumberOfHours);

        //Then
        for(Learner student : learners)
            Assert.assertEquals(expectedNumberOfHoursPerLearner, student.getTotalStudyTime(), 0.1);
    }


}
