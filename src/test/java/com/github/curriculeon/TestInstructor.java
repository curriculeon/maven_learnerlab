package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;


//Create a TestInstructor class.
public class TestInstructor {
    @Test
    //Create a testImplementation method that asserts
    // that an Instructor is an instanceof a Teacher.
    public void testImplementation() {
        // given
        Instructor instructor = new Instructor(null, null);

        // when
        boolean outcome = instructor instanceof Teacher;

        // then
        Assert.assertTrue(outcome);
    }
    //Create a testInheritance method
    // that asserts that a Instructor is an instanceof a Person.
    public void testInheritance() {
        // given
        Instructor instructor = new Instructor(null, null);

        // when
        boolean outcome = instructor instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    //Create a testTeach method that ensures when an Instructor invokes the teach method,
    // a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
    public void testTeach() {
        // given
        Instructor instructor = new Instructor(null, null);
        Learner learner = new Student(null, null);
        Double numberOfHoursToTeach = 134.0;
        Double preStudyTime = learner.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToTeach;

        // when
        instructor.teach(learner, numberOfHoursToTeach);
        Double actual = learner.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    //Create a testLecture method that ensures when an Instructor invokes the lecture method,
    // a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
    public void testLecture() {
        // given
        Teacher teacher = new Instructor(null, null);
        Learner[] learners = new Learner[]{
                new Student(0L, "Leon"),
                new Student(1L, "Christopher"),
                new Student(2L, "Hunter"),
        };
        Double numberOfHours = 128.0;
        Double expected = numberOfHours/learners.length;

        // when
        teacher.lecture(learners, numberOfHours);

        // then
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            Double actual = learner.getTotalStudyTime();
            Assert.assertEquals(expected, actual);
        }
    }
}
