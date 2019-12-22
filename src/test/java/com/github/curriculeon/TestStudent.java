package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudent {
    @Test
    public void testImplementation()
    {
        //given
        Student student;

        //when
        student = new Student(1, "Bob", 10);

        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance()
    {
        //given
        Student student;

        //when
        student = new Student(1, "Bob", 10);

        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn()
    {
        //given
        Student student;

        //when
        student = new Student(1, "Bob", 10);
        student.learn(10);

        //then
        assertEquals(20, student.getTotalStudyTime(), 0);
    }

}
