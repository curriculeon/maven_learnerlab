package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(3, "Mikky", 2);
        Assert.assertTrue(String.valueOf(student instanceof Learner), true);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(4, "Lama", 5);
        Assert.assertTrue(String.valueOf(student instanceof Person), true);
    }
    @Test
    public void testLearn (){
        Student student = new Student(6, "Jenne", 8);
        double numberOfHours = 5;
        Double total=student.totalStudyTime + numberOfHours;
        student.learn(numberOfHours);
        Assert.assertEquals(total, student.getTotalStudyTime());
    }
}
