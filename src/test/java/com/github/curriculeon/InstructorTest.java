package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InstructorTest {

    @Test
    public void implementationTest() {
        //given
        int id = 0;
        String name = "Bob";
        Instructor instructor = new Instructor(id, name);

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        //given
        int id = 0;
        String name = "Bob";
        Instructor instructor = new Instructor(id, name);

        //then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        //given
        int instructorId = 0;
        String instructorName = "Bob";
        Instructor instructor = new Instructor(instructorId, instructorName);
        int studentId = 1;
        String studentName = "Bob";
        Student student = new Student(studentId, studentName);
        double numberOfHours = 5;

        //when
        instructor.teach(student, numberOfHours);

        //then
        Assert.assertEquals(student.getTotalStudyTime(), numberOfHours, .000001);
    }

    @Test
    public void lectureTest() {
        //given
        int instructorId = 0;
        String instructorName = "Bob";
        Instructor instructor = new Instructor(instructorId, instructorName);
        String studentName = "Bob";
        Student[] students = IntStream.range(0, 10).boxed().map(studentId -> new Student(studentId, studentName)
        ).collect(Collectors.toList()).toArray(new Student[10]);
        double numberOfHours = 100;
        double numberOfHoursPerStudent = numberOfHours / students.length;

        //when
        instructor.lecture(students, numberOfHours);

        //then
        Arrays.asList(students).stream().forEach(student -> {
            Assert.assertEquals(student.getTotalStudyTime(), numberOfHoursPerStudent, .000001);
        });
    }
}
