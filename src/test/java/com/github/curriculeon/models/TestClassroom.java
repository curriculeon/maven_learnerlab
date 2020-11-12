package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {

    @Test
    public void testHostLecture() {

        Classroom classroom = Classroom.INSTANCE;
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        Person teacherAsPerson = Instructors.getInstance().findById(1L);
        Instructor teacherAsTeacher = instructors.findById(1L);
        Map<Student, Double> perStudyMap = classroom.getStudyMap();
        Double numberOfHoursToTeach = 9999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();

        classroom.hostLecture(teacherAsTeacher, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student : keySet) {
            Double preStudyTime = perStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }

    }
}
