package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest extends TestCase {
    @Test
    public void  testInheritance(){
        //given
        Long id=1L;
        String name="some one";
        Student student = new Student(id,name );

        // when
        Boolean outcome = student instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testLearn() {
        //given
        Long id=1L;
        String name="some one";
        Student student = new Student(id,name );
        Double numberOfHours=9.4;
        Double expected=student.getTotalStudyTime()+numberOfHours;

        //when
        student.learn(numberOfHours);
        Double actual=student.getTotalStudyTime();

        //then

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testImplementation() {
        //given
        Long id=1L;
        String name="some one";
        Student student = new Student(id,name );

        // when
        Boolean outcome = student instanceof Learner;

        // then
        Assert.assertTrue(outcome);
    }
}