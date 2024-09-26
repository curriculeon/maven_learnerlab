package com.github.curriculeon;

import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ClassroomTest {

    @Test
    public void testHostLecture1() {
        Classroom classroom = Classroom.INSTANCE;
        Teacher teacher = Instructors.getINSTANCE().findById(444L);
        Integer numberOfStudents = Students.getINSTANCE().count();
        Double numberOfHoursToLecture = numberOfStudents.doubleValue();
        Double expectedNumberOfHoursLearned = numberOfHoursToLecture / numberOfStudents;
        Map<Student, Double> preStudyMap = classroom.getStudyMap();

        // when
        classroom.hostLecture(teacher, numberOfHoursToLecture);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for (Student student : keySet) {
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            // then
            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }
    }
}
