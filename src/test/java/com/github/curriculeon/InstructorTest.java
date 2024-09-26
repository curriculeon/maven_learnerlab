package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testInstance() {
        //Given
        Person teacher;

        //When
        teacher = new Instructor();

        //Then
        Assert.assertTrue(teacher instanceof Person);
    }

    @Test
    public void testImplementation() {
        //Given
        Teacher teacher;

        //When
        teacher = new Instructor();

        //Then
        Assert.assertTrue(teacher instanceof Teacher);
    }

    @Test
    public void testLecture() {

        //Given
        Learner learner1 = new Student(5D);
        Learner learner2 = new Student();
        Learner learner3 = new Student(6D);
        Learner[] learners = { learner1, learner2, learner3 };
        Double[] expectedTotalStudyTimes = { 7D, 2D, 8D };

        //When
        Instructor instructor = new Instructor();
        instructor.lecture(learners, 6D);
        Double[] actualTotalStudyTimes = new Double[3];
        for (int i = 0; i < learners.length; i++) {
            actualTotalStudyTimes[i] = learners[i].getTotalStudyTime();
        }

        //Then
        Assert.assertArrayEquals(expectedTotalStudyTimes, actualTotalStudyTimes);
    }

    @Test
    public void testTeach() {
        //Given
        Learner learner = new Student(5D);
        Teacher teacher = new Instructor();

        //When
        teacher.teach(learner, 6D);
        Double actualTotalStudentStudyTime = learner.getTotalStudyTime();


        //Then
        Double expectedTotalStudentStudyTime = 5D + 6D;
        Assert.assertEquals(expectedTotalStudentStudyTime, actualTotalStudentStudyTime);
    }


}
