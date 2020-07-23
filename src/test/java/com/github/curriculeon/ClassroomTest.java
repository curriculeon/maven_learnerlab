package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class ClassroomTest {


    private void testHostLecture(boolean tru) {
        // Given
     Classroom classr =new Classroom();
     Student student= classr.students.findByID(1L);
      Double before= student.getTotalStudyTime();
        classr.hostLecture(1L,2.0);
        Double expected = 2.0;
        // Then
        Double after=student.getTotalStudyTime();
        Double actual= after-before;



        Assert.assertEquals(expected,actual);
    }


    @Test
    public void test() {
        testHostLecture(true);
    }
}
