package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestClassroom {
    @Test
    public void testHostLecture() {
        //Given
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
        Classroom classroom = Classroom.getInstance();

        //When
        classroom.hostLecture((Teacher)instructors.findById(0), 30);
        classroom.hostLecture((Teacher)instructors.findById(0), 60);
        classroom.hostLecture((Teacher)instructors.findById(1), 36);
        classroom.hostLecture((Teacher)instructors.findById(1), 66);

        //Then
        for (Student student : (Student[]) students.toArray()) {
            double expectedStudyTime = student.getTotalStudyTime();
            double actualStudyTime = classroom.getStudyMap().get(student);
            System.out.printf("Expecting studying time for student %d: %s\n", student.getId(), expectedStudyTime);
            Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.1);
        }
    }
}
