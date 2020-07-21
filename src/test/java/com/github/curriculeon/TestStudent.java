package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    public void testImplementation(){
        //Given

        //Where

        //Then
        Student studentOne = new Student();
        Assert.assertTrue(studentOne instanceof Learner);

    }
    public void testInheritance(){
        //Given

        //Where

        //Then
        Student studentTwo = new Student();
        Assert.assertTrue(studentTwo instanceof Person);
    }
    public void testLearn(Double expectedTimeToAdd){
        //Given
        Student studentThree = new Student(4.5);
        //Where
        Double actualHours = studentThree.getTotalStudyTime() + expectedTimeToAdd;
        //Then
        studentThree.learn(expectedTimeToAdd);
        Double newHours = studentThree.getTotalStudyTime();
        Assert.assertEquals(newHours, actualHours);
    }

    @Test
    public void test0(){
        testImplementation();
    }

    @Test
    public void test1(){
        testInheritance();
    }

    @Test
    public void test2(){
        testLearn(5.5);
    }
}




