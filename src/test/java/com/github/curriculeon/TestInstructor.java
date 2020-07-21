package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor extends TestCase {

    @Test
    public void testInheritance() {
        //given

        Instructor instructor = new Instructor(null, null);

        // when
        Boolean outcome = instructor instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testImplementation() {
        //given

        Instructor instructor = new Instructor(null, null);

        // when
        Boolean outcome = instructor instanceof Teacher;

        // then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testLearn() {
        //given

        Learner learners = new Student(null, null);
        Instructor instructor = new Instructor(null, null);
        Double numberOfHours = 9.4;
        Double expected = learners.getTotalStudyTime() + numberOfHours;

        //when
        instructor.teach(learners, numberOfHours);
        Double actual= learners.getTotalStudyTime();
     //   Double actual = instructor.lecture(learner, numberOfHours);

        //then

        Assert.assertEquals(expected, actual);

    }

    public void testLecture() {
        //given
        Teacher teacher=new Instructor(null,null);
        Learner[] learners = {
                new Student(1L, "student1"),
                new Student(2L, "student2"),
                new Student(3L, "student3"),
                new Student(4L, "student4"),
        };
        Double numberOfHours = 28.2;
        Double expected = numberOfHours / learners.length;
        //when
        teacher.lecture(learners,numberOfHours);
        //then
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            Double actual=learner.getTotalStudyTime();
            Assert.assertEquals(expected,actual);
        }


    }
}