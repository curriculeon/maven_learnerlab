package com.github.curriculeon;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
//        long expectedId = 123456789;
//        String expectedName= "Some name";
//        double expectedStudyTime = 6;
//       Student student =  new Student(expectedId, expectedName);
//       student.learn(expectedStudyTime);
//       double actualStudyTime = student.getTotalStudyTime();
//        Assert.assertEquals(expectedStudyTime, actualStudyTime,123456789);
        //given
        Student student = new Student(0, null);

        //when
        Boolean result = student instanceof Learner;
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testInheritance() {
//        long expectedId = 123456789;
//        String expectedName = "John";
//        Student student = new Student(expectedId, expectedName);
//        long actualId = student.getId();
//        String actualName= student.getName();
//
//        Assert.assertEquals(expectedId, actualId);
//        Assert.assertEquals(expectedName, actualName);

        //given
        Student student = new Student(0, null);
        //when
        Boolean result = student instanceof Person;
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testLearn() {
        //given
        long id = 987654321;
        String name = "Jane Doe";
        double numberOfHours = 5;
        //when
        Student student = new Student(id, name);
        student.learn(numberOfHours);
        double totalStudyTime = student.getTotalStudyTime();
        student.learn(numberOfHours);
        double expectedNumberOfHours = numberOfHours + totalStudyTime;
        double actualTotalNumberOfHours = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedNumberOfHours, actualTotalNumberOfHours, 0l);
    }
}
