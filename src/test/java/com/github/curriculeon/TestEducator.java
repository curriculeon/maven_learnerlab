package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {
    @Before
    public void init(){
        Instructors.getInstance().personList.clear();
    }

    //given
    Educator educator1 = Educator.LEON;
    Educator educator2 = Educator.FRED;
    Educator educator3 = Educator.DAVID;
    Instructor instructor1 = new Instructor((long)educator1.ordinal(), educator1.name());
    Instructor instructor2 = new Instructor((long)educator2.ordinal(), educator2.name());
    Instructor instructor3 = new Instructor((long)educator3.ordinal(), educator3.name());

    @Test
    public void testImplementation(){

        //when
        Instructors.getInstance().personList.add(educator1.ordinal(), instructor1);
        Instructors.getInstance().personList.add(educator2.ordinal(), instructor2);
        Instructors.getInstance().personList.add(educator3.ordinal(), instructor3);

        assert educator1 != null;

        String name = educator1.name();
        //then
        Assert.assertEquals(Educator.LEON.name(), name);
    }

    @Test
    public void testTeach(){
        //given
        Learner student = new Student(null, null);
        double numberOfHoursToTeach = 10;
        double preStudyTime = student.getTotalStudyTime();
        double expected = preStudyTime + numberOfHoursToTeach;
        //double expectedTimeWorked = 0.0;
        //expectedTimeWorked += numberOfHoursToTeach;
        //when
        instructor1.teach(student,numberOfHoursToTeach);
        double actual = student.getTotalStudyTime();
        //double timeWorked = educator.getTimeWorked();

        //then
        Assert.assertEquals(expected, actual, 0.01);
        //Assert.assertEquals(expectedTimeWorked, timeWorked, 0.01);
    }

    @Test
    public void testLecture() {
        // given
        Learner student1 = new Student(null, null);
        Learner student2 = new Student(null, null);
        Learner[] students = {student1, student2};
        double numberOfHoursToTeach = 100;
        double preStudyTime1 = student1.getTotalStudyTime();
        double preStudyTime2 = student2.getTotalStudyTime();
        double expected1 = (preStudyTime1 + numberOfHoursToTeach) / students.length;
        double expected2 = (preStudyTime2 + numberOfHoursToTeach) / students.length;

        // when
        instructor1.lecture(students, numberOfHoursToTeach);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        // then
        Assert.assertEquals(expected1, actual1, 0.01);
        Assert.assertEquals(expected2, actual2, 0.01);
    }
}
