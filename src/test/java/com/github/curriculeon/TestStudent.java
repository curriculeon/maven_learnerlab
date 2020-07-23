package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
         Student student = new Student(null, null);
        // when
        boolean expected = student instanceof Learner;
        //then
        Assert.assertTrue(expected);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(new Student(null, null) instanceof Person);
    }


    @Test
    public void testLearn(){
        //Given
        Student student = new Student(20l, "Emmanuel");
        Double studentStudyTime = 40.0;
        Double preStudy = student.getTotalStudyTime();
        Double expected = studentStudyTime + preStudy;
        //When
        student.learn(studentStudyTime);
        Double actual = student.getTotalStudyTime();

        //then

        Assert.assertEquals(expected,actual);
    }
}
