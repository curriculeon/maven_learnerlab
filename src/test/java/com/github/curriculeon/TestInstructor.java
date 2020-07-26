package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean outcome = instructor instanceof Teacher;

        //then
        Assert.assertTrue(outcome);
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
        Instructor instructor = new Instructor(null, null);
        Learner learner = new Student(null, null);
        Double numberOfHoursToTeach = 134.0;
        Double preStudyTime = learner.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToTeach;

        //when
        instructor.teach(learner, numberOfHoursToTeach);
        Double actual = learner.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        //given
        Teacher teacher = new Instructor(null, null);
        Student baseStudent = new Student(null, null);
        Learner[] learners = new Learner[]{
                new Student(0L, "John"),
                new Student(1L, "Q"),
                new Student(2L, "Public")
        };
        Double numberOfHours = 128.0;
        Double expected = numberOfHours/learners.length + baseStudent.getTotalStudyTime();

        //when
        teacher.lecture(learners, numberOfHours);

        //then
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            Double actual = learner.getTotalStudyTime();
            Assert.assertEquals(expected, actual);

        }
    }
}
