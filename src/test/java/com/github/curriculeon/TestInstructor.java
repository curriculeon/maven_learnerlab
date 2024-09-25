package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleUnaryOperator;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(null, null);

        //When
        boolean expected = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(expected);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(null, null);

        //When
        boolean expected = instructor instanceof Person;

        //Then
        Assert.assertTrue(expected);

    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor =  new Instructor(null, null);
        Learner learn = new Student(null, null);
        Double numberOfTeachingHours = 90.0d;
        Double hours = learn.getTotalStudyTime();
        Double expected = hours + numberOfTeachingHours ;
        //When
        instructor.teach(learn, numberOfTeachingHours);
        Double actual = learn.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        //Given
        Teacher instructor = new Instructor(null, null);
        Double numberHours = 134d;
        Learner[] learn = new Learner[] {
            new Student(22l, "Emmanuel"),
            new Student(23l, "Mike"),
            new Student(24l, "Leon")
        };

        Double expected = numberHours/learn.length;



        //When
        instructor.lecture(learn, numberHours);


        //Then
        for (int i = 0; i < learn.length; i++) {
            Learner learner = learn[i];
            Double actual = learner.getTotalStudyTime();

            Assert.assertEquals(expected, actual);

        }
    }
}
