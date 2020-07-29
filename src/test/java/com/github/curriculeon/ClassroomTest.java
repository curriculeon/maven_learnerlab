package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class ClassroomTest extends TestCase {
    @Test
    public void testHostLecture() {
        //given
        Classroom classroom = Classroom.getInstance();
        Teacher teacher = Instructors.getInstance().findById(1L);
        Integer numberOfStudents = Students.getInstance().count();
        Double numberOfHoursToLecture = numberOfStudents.doubleValue();
        Double expectedHoursLearned = numberOfHoursToLecture / numberOfStudents;
        Map<Student, Double> preStudyMap = classroom.getStudyMap();


        //when
        classroom.hostLecture(teacher, numberOfHoursToLecture);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for (Student student : keySet) {
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            // then
            Assert.assertEquals(expectedStudyTime, actualStudyTime);

        }


    }
}