package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    public void testImplementation(){
        //Given
        Instructor instructorOne = new Instructor();
        //Where

        //Then
        Assert.assertTrue(instructorOne instanceof Teacher);
    }
    public void testInheritance(){
        //Given
        Instructor instructorTwo = new Instructor();
        //Where

        //Then
        Assert.assertTrue(instructorTwo instanceof Person);
    }
    public void testTeach(Double hoursToAdd){
        //Given
        Instructor instructorThree = new Instructor();
        Student studentOne = new Student();
        Double currentStudentHours = studentOne.getTotalStudyTime();

        //Where
        Double expectedStudentHours = currentStudentHours + hoursToAdd;
        instructorThree.teach(studentOne, hoursToAdd);
        Double actualStudentHours = studentOne.getTotalStudyTime();

        //Then
        Assert.assertEquals(actualStudentHours, expectedStudentHours);
    }
    public void testLecture(Double hours){
        //Given

        //Where

        //Then
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
        testTeach(5.0);
    }
    @Test
    public void test3(){
    
    }
}
