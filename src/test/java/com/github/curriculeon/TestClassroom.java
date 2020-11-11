package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {
    @Test
    public void testHostLecture() {
        // given
        Classroom classroom = Classroom.INSTANCE;
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        Instructor teacherAsTeacher = instructors.findById(1L);
        Map<Student, Double> preStudyMap = classroom.getStudyMap();
        Double numberOfHoursToTeach = 9999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();

        // when
        classroom.hostLecture(teacherAsTeacher, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student : keySet) {
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            // then
            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }
    }
}
