package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Test;

public class TestStudent extends TestCase {

    @Test
    public void testImplementation(){
        //given & when
        Student student = new Student(1, "Test");

        //then
        assert student instanceof Learner;
    }

    @Test
    public void testInheritance(){
        //given & when
        Student student = new Student(1, "Test");

        //then
        assert student instanceof Person;
    }

    @Test
    public void testLearn() {
        //given
        Student student = new Student(1, "Test");

        //when
        double hours = 5;
        student.learn(hours);

        //then
        assertEquals(hours, student.getTotalStudyTime());
    }
}