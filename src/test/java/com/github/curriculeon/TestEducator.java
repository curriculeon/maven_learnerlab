package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.sql.PseudoColumnUsage;

public class TestEducator {
    @Test
    public void testImplementation() {
        //given
        //when
        Boolean isInstanceOfEducator = Educator.LEON instanceof Teacher;
        //then
        Assert.assertTrue(isInstanceOfEducator);
    }

    @Test
    public void testInheritance() {
        Boolean isInstanceOfTeacher = Educator.ALI instanceof Teacher;
        Assert.assertTrue(isInstanceOfTeacher);
    }

    @Test
    public void testTeach() {
        //given
        Learner learner1 = new Student(4, "Jenny");
        Learner learner2 = new Student(5, "Jim");

        Educator educator1 = Educator.LEON;
        double currentTimeWorked = educator1.getTimeWorked();
        //when
        double numberOfHours1 = 5;
        double numberOfHours2 = 10;
        educator1.teach(learner1, numberOfHours1);
        educator1.teach(learner2, numberOfHours2);
        //then
        Assert.assertEquals(currentTimeWorked+numberOfHours1+numberOfHours2, educator1.getTimeWorked(), 0);
    }

    @Test
    public void testLecture() {
        //given
        Educator educator1 = Educator.LEON;
        Learner learner1 = new Student(4, "Jenny");
        Learner learner2 = new Student(5, "Alice");
        Learner learner3 = new Student(6, "Justin");
        Learner[] learners = {learner1,learner2, learner3};
        //when
        double numberOfHours = 10;
        double currentTimeWorked = educator1.getTimeWorked();
        educator1.lecture(learners, numberOfHours);
        //then
        Assert.assertEquals(currentTimeWorked+numberOfHours, educator1.getTimeWorked(), 1);


    }

}
