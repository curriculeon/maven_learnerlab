package com.github.curriculeon;

import org.junit.Assert;

public class TestStudent {
    public void testImplementation(){
        Student student = new Student();
        Learner learner = new Student();
        Assert.assertEquals(student, learner);
    }
    public void testInheritance(){
        Student student = new Student();
        Person person = new Person();
        Assert.assertEquals(student, person);
    }
    public void testLearn (){
        Student student = new Student();
        double numberOfHours = 5;
        Double total=student.totalStudyTime + numberOfHours;
        student.learn(numberOfHours);
        Assert.assertEquals(total, student.getTotalStudyTime());

    }
}
