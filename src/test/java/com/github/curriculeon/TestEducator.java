package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testTeach()
    {
        //given
        final Instructor instructor = new Instructor(Educator.instructor1.getId(), Educator.instructor1.getName());
        Learner student = new Student(1, "John", 20);

        //when
        instructor.teach(student, 10);
        instructor.setTimeWorked(30);

        //then
        Assert.assertEquals(30, student.getTotalStudyTime(), 0);
        Assert.assertEquals(30, instructor.getTimeWorked(), 0);
    }

    @Test
    public void testLecture()
    {
        //given
        Instructor instructor = new Instructor(1, "Bob");
        Student student1 = new Student(1, "John", 20);
        Student student2 = new Student(2, "Jim", 30);
        Student student3 = new Student(3, "Alice", 40);
        Student student4 = new Student(4, "Eve", 50);

        Learner []students = new Student[]{student1, student2, student3, student4};

        //when
        instructor.lecture(students, 40);
        instructor.setTimeWorked(20);

        //then
        Assert.assertEquals(30, student1.getTotalStudyTime(), 0);
        Assert.assertEquals(40, student2.getTotalStudyTime(), 0);
        Assert.assertEquals(50, student3.getTotalStudyTime(), 0);
        Assert.assertEquals(60, student4.getTotalStudyTime(), 0);
        Assert.assertEquals(20, instructor.getTimeWorked(), 0);
    }

    @Test
    public void testTimeWorked()
    {
        //given
        final Instructor instructor1 = new Instructor(Educator.instructor1.getId(), Educator.instructor1.getName());
        final Instructor instructor2 = new Instructor(Educator.instructor2.getId(), Educator.instructor2.getName());
        final Instructor instructor3 = new Instructor(Educator.instructor3.getId(), Educator.instructor3.getName());
        final Instructor instructor4 = new Instructor(Educator.instructor4.getId(), Educator.instructor4.getName());
        final Instructor instructor5 = new Instructor(Educator.instructor5.getId(), Educator.instructor5.getName());

        //when
        instructor1.setTimeWorked(10);
        instructor2.setTimeWorked(20);
        instructor3.setTimeWorked(30);
        instructor4.setTimeWorked(40);
        instructor5.setTimeWorked(50);

        //then
        Assert.assertEquals(10, instructor1.getTimeWorked(), 0);
        Assert.assertEquals(20, instructor2.getTimeWorked(), 0);
        Assert.assertEquals(30, instructor3.getTimeWorked(), 0);
        Assert.assertEquals(40, instructor4.getTimeWorked(), 0);
        Assert.assertEquals(50, instructor5.getTimeWorked(), 0);
    }
}
