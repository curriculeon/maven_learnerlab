package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a Classroom class.
 * Create a testHostLecture method which ensures that each of the Student's totalStudyTime instance variable
 * is incremented by the specified numberOfHours upon invoking the hostLecture method.
 */
public class TestClassroom {
    @Test
    public void testHostLecture(){
        //given
        Classroom classroom = new Classroom();
        double initialStudyHours, studyHoursAfterLecture;
        double numberOfHoursStudied = 10;

        Map<Student, Double> initialMap = classroom.getStudyMap();

        //when
        classroom.hostLecture(11, numberOfHoursStudied);
        Map<Student, Double> mapAfterHostLecture = classroom.getStudyMap();

        //then
        //for each student get initial study hours and compare with studyhours after lecture
        for (Student student : initialMap.keySet())
        {
            // search  for value
             initialStudyHours = initialMap.get(student);
            studyHoursAfterLecture = mapAfterHostLecture.get(student);
            double expectedStudeyHours = initialStudyHours+ numberOfHoursStudied;
            Assert.assertEquals((long)expectedStudeyHours, (long)studyHoursAfterLecture);
        }
    }
}
