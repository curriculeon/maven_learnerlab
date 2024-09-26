package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {

        //given
        Instructor instructor = new Instructor(-1,null);

        //when
        Boolean outcome = instructor instanceof Teacher;

        //then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(-1, null);
        Boolean outcome = instructor instanceof Person;
        Assert.assertTrue(outcome);
    }

    @Test
    public void testTeach() {
        // given
        Instructor instructor = new Instructor(-1, null);
        Learner learner = new Student(-1, null);
        Double numberOfHoursToTeach = 134.0;
        Double preStudyTime = learner.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToTeach;

        // when
        instructor.teach(learner,numberOfHoursToTeach);
        Double actual = learner.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        //given
        Teacher teacher = new Instructor(-1, null);
        Learner[] learners = new Learner[] {
                new Student(0L, "Leon"),
                new Student(1L, "Christopher"),
                new Student(2L, "Hunter")
        };
        Double numberOfHours = 128.0;
        Double expected = numberOfHours / learners.length;

        // when
        teacher.lecture(learners,numberOfHours);

        //then
        for (int i =0 ; i < learners.length ; i++) {
            Learner learner = learners[i];
            Double actual = learner.getTotalStudyTime();
            Assert.assertEquals(expected,actual);
        }

    }
}
