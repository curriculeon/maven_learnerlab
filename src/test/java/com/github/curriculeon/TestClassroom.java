package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestClassroom {

    @Test
    public void testHostLecture(){
        Classroom classroom = new Classroom();
        Instructor leon = new Instructor(1, "Leon");
        classroom.hostLecture(leon,9);
        Student student = classroom.students.findById(1);
        double expected = 3;
        Map<Student,Double> tempMap = classroom.getStudyMap();
        double actual = tempMap.get(student);
        Assert.assertEquals(actual,expected,0.0);

    }
}
