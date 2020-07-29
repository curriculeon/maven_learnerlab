package com.github.curriculeon;

import org.junit.Test;

import java.util.Map;

public class TestClassroom {

    @Test
    public void testHoursLecture() {
        Classroom classroom = Classroom.INSTANCE;
        Teacher lecturer = (Teacher) Instructors.getInstance().findById(1L);
        Integer numberOfStudents = Students.getInstance().count();
        Map<Student, Double> preStudyTimeMap = classroom.getStudyMap();
        Double numberOfHoursToLecture = 300.0;
        Double numberOfHoursStudidedPerStudent = numberOfHoursToLecture / numberOfStudents;

        // when
        classroom.hostLecture(lecturer, numberOfHoursToLecture);
        Map<Student, Double> newStudyMap = classroom.getStudyMap();
    }
}
