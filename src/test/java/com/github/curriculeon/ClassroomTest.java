package com.github.curriculeon;

import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClassroomTest {

    @Test
    public void testHostLecture1() {
        //given
        double numHoursTaught = 21D;
        Classroom classroom = new Classroom();
        Map<Student, Double> studyMapBefore = (HashMap)(classroom.getStudyMap());
        Double[] expectedHours = new Double[studyMapBefore.size()];
        int studentCounter = 0;
        for ( Map.Entry<Student, Double> entry : studyMapBefore.entrySet()) {
            expectedHours[studentCounter] = entry.getValue() + numHoursTaught / studyMapBefore.size();
            studentCounter++;
        }

        //when
        //get the first instructor's id of the instructors in the classroom
        long instructorId = 444;

        classroom.hostLecture(instructorId, numHoursTaught);

        Map<Student, Double> studyMapAfter = (HashMap)(classroom.getStudyMap());
        Double[] actualHours = new Double[studyMapAfter.size()];
        studentCounter = 0;
        for ( Map.Entry<Student, Double> entry : studyMapAfter.entrySet()) {
            actualHours[studentCounter] = entry.getValue();
            studentCounter++;
        }

        //then
        Assert.assertArrayEquals(actualHours, expectedHours);

    }
}
