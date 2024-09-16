package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        //given
        Object instructor = new Instructor(0,"");
        //when
        boolean output = instructor instanceof Teacher;
        //then
        Assert.assertTrue(output);
    }

    @Test
    public void testInheritance() {
        // given
        Object instructor = new Instructor(1, "");

        // when
        Boolean output = instructor instanceof Person;

        // then
        Assert.assertTrue(output);
    }

    public void testTeach(Learner learner,Double expected, Double numOfHours){
        // When
        Instructor instructor = new Instructor(1, "Name");
        instructor.teach(learner,numOfHours);

        // Then
        Double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    public void testLecture(Learner[] learners,Double expected, Double numOfHours){
        // When
        Instructor instructor = new Instructor(1, "Name");
        instructor.lecture(learners,numOfHours);

        // Then
        Double actual = learners[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test0(){
        Student student = new Student(1, "");
        testTeach(student,5.0,5.0);
    }

    @Test
    public  void test1(){
        Student student = new Student(1, "");
        Student student2 = new Student(1, "");
        Student student3 = new Student(1, "");
        Learner[] students = new Learner[3];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;
        testLecture(students,3.0,9.0);

    }

}