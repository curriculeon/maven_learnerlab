package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EducatorTest {
    
    @Test
    public void teachTest() {
        //given
        Educator educator = Educator.MATH_INSTRUCTOR;
        int studentId = 1;
        String studentName = "Bob";
        Student student = new Student(studentId, studentName);
        double numberOfHours = 5;
        double previousHoursWorked = educator.getTotalHoursWorked();
    
        //when
        educator.teach(student, numberOfHours);
        
        //then
        Assert.assertEquals(student.getTotalStudyTime(), numberOfHours, .000001);
        Assert.assertEquals(educator.getTotalHoursWorked(), previousHoursWorked + numberOfHours, 0.0);
    }
    
    @Test
    public void lectureTest() {
        //given
        Educator educator = Educator.MATH_INSTRUCTOR;
        String studentName = "Bob";
        Student[] students = IntStream.range(0, 10).boxed().map(studentId -> new Student(studentId, studentName)
        ).collect(Collectors.toList()).toArray(new Student[10]);
        double numberOfHours = 100;
        double numberOfHoursPerStudent = numberOfHours / students.length;
        double previousHoursWorked = educator.getTotalHoursWorked();
        
        //when
        educator.lecture(students, numberOfHours);
        
        //then
        Arrays.asList(students).stream().forEach(student -> {
            Assert.assertEquals(student.getTotalStudyTime(), numberOfHoursPerStudent, .000001);
        });
        Assert.assertEquals(educator.getTotalHoursWorked(), previousHoursWorked + numberOfHours, 0.0);
    }
}
