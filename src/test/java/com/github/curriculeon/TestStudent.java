package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void TestImplementation(){
        //given
        Student student=new Student(1,"Jane",5);
        //when
        Boolean isInstanceOfLearner=student instanceof Learner;
        //then
        Assert.assertTrue(isInstanceOfLearner);
    }

    @Test
    public void TestInheritence(){
        //given
        Student student=new Student(1,"Jane",5);
        //when
        Boolean isInstanceOfPerson=student instanceof Person;
        //then
        Assert.assertTrue(isInstanceOfPerson);
    }

    private void TestLearn(double addValue){
        //given
        Student student=new Student(1,"Jane",5);
        //when
        double expectedValue=5+addValue;
        student.learn(addValue);
        double actualValue=student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedValue,actualValue,0);
    }

    @Test

    public void TestLearn0(){
        TestLearn(2.0);
    }

    @Test

    public void TestLearn1(){
        TestLearn(4.0);
    }

    @Test

    public void TestLearn2(){
        TestLearn(11.0);
    }
}
