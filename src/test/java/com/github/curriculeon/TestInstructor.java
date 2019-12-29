package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation()
    {
        //given
        Instructor instructor;

        //when
        instructor = new Instructor(1, "Bob");

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance()
    {
        //given
        Instructor instructor;

        //when
        instructor = new Instructor(1, "Bob");

        //then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach()
    {
        //given
        Instructor instructor = new Instructor(1, "Bob");
        Learner student = new Student(1, "John", 20);

        //when
        instructor.teach(student, 10);

        //then
        Assert.assertEquals(30, student.getTotalStudyTime(), 0);
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

        //then
        Assert.assertEquals(30, student1.getTotalStudyTime(), 0);
        Assert.assertEquals(40, student2.getTotalStudyTime(), 0);
        Assert.assertEquals(50, student3.getTotalStudyTime(), 0);
        Assert.assertEquals(60, student4.getTotalStudyTime(), 0);
    }
}
