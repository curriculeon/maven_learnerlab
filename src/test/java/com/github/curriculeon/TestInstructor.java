package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    public void testImplementation(){
        //Given
        Object instructorOne = new Instructor();

        //When

        //Then
        Assert.assertTrue(instructorOne instanceof Teacher);
    }
    public void testInheritance(){
        //Given
        Object instructorTwo = new Instructor();
        //When

        //Then
        Assert.assertTrue(instructorTwo instanceof Person);
    }
    public void testTeach(Double hoursToAdd){
        //Given
        Instructor instructorThree = new Instructor();
        Student studentOne = new Student();
        Double currentStudentHours = studentOne.getTotalStudyTime();
        Double expectedStudentHours = currentStudentHours + hoursToAdd;

        //When
        instructorThree.teach(studentOne, hoursToAdd);
        Double actualStudentHours = studentOne.getTotalStudyTime();

        //Then
        Assert.assertEquals(actualStudentHours, expectedStudentHours);
    }
    public void testLecture(Double hours){
        //Given
        Teacher instructorFour = new Instructor();
        Learner[] students = new Learner[]{
                new Student(0l, "Marcus"),
                new Student(1L, "Luke"),
                new Student(2L, "Zach")
        };
        Double expectedHours = hours/students.length;
        //When
        instructorFour.lecture(students, hours);
        //Then
        for(int i = 0; i < students.length; i++){
            Learner learner = students[i];
            Double actualHours = learner.getTotalStudyTime();
            Assert.assertEquals(actualHours,expectedHours);
        }
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
        testLecture(5.0);
    }
}
