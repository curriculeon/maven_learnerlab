package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestClassroom {


    @Test
    public void testHostLecture(){
        //Given
        Classroom classroom = Classroom.getClassroom();
        Teacher teacher = Instructors.getINSTANCE().findById(2l);
        Integer numberOfStudents = Students.getINSTANCE().count();
        Double numberOfHoursToLecture = numberOfStudents.doubleValue();
        Double expectedNumberOfHours = numberOfHoursToLecture / numberOfStudents;
        Map<Student, Double> preStudyMap = classroom.getStudyMap();

        //When
        classroom.hostLecture(teacher, numberOfHoursToLecture);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for (Student student : keySet) {
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHours;
            Double actualStudyTime = postStudyMap.get(student);



            //Then
            Assert.assertEquals(expectedStudyTime, actualStudyTime);

        }


    }
}
