package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestConstructor {
    //create a testImplementation method that asserts that an instructor is an instance of teacher

    @Test
    public void testImplementation() {

        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean outcome = instructor instanceof Teacher;


        //then
        Assert.assertTrue(outcome);

        // (all in one line)Assert.assertTrue(new Instructor(null, null)instanceof Teacher);
    }

    @Test
    public void testInheritance() {

        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean outcome = instructor instanceof Person;


        //then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testTeach(){

        //given
        Instructor instructor=new Instructor(null, null);
        Learner learner=new Student(null, null);
        Double numberOfHoursToTeach=134.0;
        Double preStudyTime=learner.getTotalStudyTime();
        //total study time before giving the lecture
        Double expected=preStudyTime + numberOfHoursToTeach;

        //when
        //when an Instructor invokes teach method, respective student's totalStudyTime instance variable incremented by specified numberOfHours
         //instructor is able to teach some learner for some hours, here teacher is teaching for some numberOfHoursToTeach
        instructor.teach(learner, numberOfHoursToTeach);
        Double actual=learner.getTotalStudyTime();



        //then
        //exected is equal to actual such that actual is equal to some TotalStudyTime
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testLecture() {
        //lecture method ensures when an instructor invokes lecture method, respective array of students totalStudyTime instance variables is incremented by numberOfHours/students.length

   //given
        Teacher teacher=new Instructor(null, null);
        Learner[] learners=new Learner[]{
                new Student(0L,"leon"),
                new Student(1L, "Christopher"),
                new Student(2L, "Leon Hunter")


        };
        Double numberOfHours=128.0;
        Double expected=numberOfHours/learners.length;

        //when

        teacher.lecture(learners, numberOfHours);


        //then

        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            Double actual=learner.getTotalStudyTime();
            Assert.assertEquals(expected, actual);
            //Assert.assertEquals(numberOfHoursToTeach, totalStudyTime);

        }


    }
    }
