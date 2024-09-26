package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    public void testImplementation(){
        //Given
        Student studentOne = new Student();
        //When
        Boolean result = studentOne instanceof  Learner;
        //Then

        Assert.assertTrue(result);

    }
    public void testInheritance(){
        //Given
        Student studentTwo = new Student();

        //Where
        Boolean result = studentTwo instanceof  Person;
        //Then

        Assert.assertTrue(result);
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




