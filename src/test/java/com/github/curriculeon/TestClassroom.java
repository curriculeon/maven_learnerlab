package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {
    @Test
    public void testHostLecture() {
        //given
        Classroom classroom = Classroom.INSTANCE;
        Teacher teacher = Instructors.getInstance().findById(0L);
        Integer numberOfStudents = Students.getInstance().count();
        Double numberOfHoursToLecture = numberOfStudents.doubleValue();
        Double expectedNumberOfHoursLearned = numberOfHoursToLecture / numberOfStudents;
        Map<Student, Double> preStudyMap = classroom.getStudyMap();

        //When
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
