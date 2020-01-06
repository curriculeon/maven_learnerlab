package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student();
        Assert.assertTrue(String.valueOf(student instanceof Learner), true);
    }
    @Test
    public void testInheritance(){
        Student student = new Student();
        Assert.assertTrue(String.valueOf(student instanceof Person), true);
    }
    @Test
    public void testLearn (){
        Student student = new Student();
        double numberOfHours = 5;
        Double total=student.totalStudyTime + numberOfHours;
        student.learn(numberOfHours);
        Assert.assertEquals(total, student.getTotalStudyTime());
    }
}
