package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestClassroom {

    @Test
    public void testHostLecture() {
        //given
        Classroom classroom = Classroom.INSTANCE;
        Teacher teacher = (Teacher) Instructors.getInstance().findById(1L);
        double numberOfHours = Students.getInstance().count();
        double hoursPerStudent = numberOfHours / Students.getInstance().count();
        Map<Student, Double> preStudyMap = classroom.getStudyMap();

        //when
        classroom.hostLecture(teacher, numberOfHours);
        Map<Student, Double> postStudyMap = classroom.getStudyMap();

        for(Map.Entry<Student, Double> entry : preStudyMap.entrySet()){
            Student student = entry.getKey();
            double preStudyTime = entry.getValue();
            double actualStudyTime = postStudyMap.get(student);
            double expectedStudyTime = preStudyTime + hoursPerStudent;

            //then
            Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
        }


    }
}
