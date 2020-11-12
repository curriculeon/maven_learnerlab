package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        //given
        Educator educator = Educator.LEON;
        //when
        boolean outcome = educator instanceof Teacher;
        String name = educator.name();
        //then
        Assert.assertEquals(Educator.LEON.name(), name);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testTeach(){
        //given
        Educator educator = Educator.LEON;
        Instructor instructor = new Instructor((long)educator.ordinal(), educator.name());
        Learner student = new Student(null, null);
        double numberOfHoursToTeach = 10;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime + numberOfHoursToTeach;
        //double expectedTimeWorked = 0.0;
        //expectedTimeWorked += numberOfHoursToTeach;
        //when
        instructor.teach(student,numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();
        //double timeWorked = educator.getTimeWorked();

        //then
        Assert.assertEquals(expected, actual, 0.01);
        //Assert.assertEquals(expectedTimeWorked, timeWorked, 0.01);
    }

    @Test
    public void testLecture() {
        // given
        Educator educator = Educator.LEON;
        Instructor instructor = new Instructor((long)educator.ordinal(), educator.name());
        Learner student1 = new Student(null, null);
        Learner student2 = new Student(null, null);
        Learner[] students = {student1, student2};
        double numberOfHoursToTeach = 100;
        double preStudyTime1 = student1.getTotalStudyTime();
        double preStudyTime2 = student2.getTotalStudyTime();
        double expected1 = (preStudyTime1 + numberOfHoursToTeach) / students.length;
        double expected2 = (preStudyTime2 + numberOfHoursToTeach) / students.length;

        // when
        instructor.lecture(students, numberOfHoursToTeach);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        // then
        Assert.assertEquals(expected1, actual1, 0.01);
        Assert.assertEquals(expected2, actual2, 0.01);
    }
}
