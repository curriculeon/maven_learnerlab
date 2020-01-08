package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(3, "Jack");
        Boolean isInstanceOfTeacher = instructor instanceof Teacher;
        Assert.assertTrue(isInstanceOfTeacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(3, "Jack");
        Boolean isInstanceOfPerson = instructor instanceof Person;
        Assert.assertTrue(isInstanceOfPerson);
    }

    @Test
    public void testTeach() {
        //given
        Instructor instructor = new Instructor(3, "Jack");
        Learner learner = new Student(4, "Jenny");
        double currentTotalStudyTime = learner.getTotalStudyTime();
        //when
        instructor.teach(learner, 5);
        //then
        Assert.assertEquals(currentTotalStudyTime+5, learner.getTotalStudyTime(), 0);
    }

    @Test
    public void testLecture() {
        //given
        Instructor instructor = new Instructor(3, "Jack");
        Learner learner1 = new Student(4, "Jenny");
        Learner learner2 = new Student(5, "Alice");
        Learner learner3 = new Student(6, "Justin");
        double currentTotalStudyTime1 = learner1.getTotalStudyTime();
        double currentTotalStudyTime2 = learner2.getTotalStudyTime();
        double currentTotalStudyTime3 = learner3.getTotalStudyTime();

        Learner[] learners = {learner1,learner2, learner3};
        //when
        instructor.lecture(learners, 6);
        //then
        Assert.assertEquals(currentTotalStudyTime1+2, learner1.getTotalStudyTime(), 0);
        Assert.assertEquals(currentTotalStudyTime2+2, learner2.getTotalStudyTime(), 0);
        Assert.assertEquals(currentTotalStudyTime3+2, learner3.getTotalStudyTime(), 0);

    }
}
