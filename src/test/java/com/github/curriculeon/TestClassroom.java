package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.Map;

import static org.junit.Assert.*;

public class TestClassroom {
    @Test
    public void testHostLecture() {
        //given
        Classroom classroom =  Classroom.getInstance();
        Educator educator = Educator.LEON;
        for (Person s : classroom.getStudents()) {
            double currentTotalStudyTIme = ((Student)s).totalStudyTime;
            double addedStudyTime = 5;
            ((Student)s).learn(addedStudyTime);
            Assert.assertEquals(currentTotalStudyTIme+addedStudyTime, ((Student)s).getTotalStudyTime(), 0);
        }

        // when
        Map<Student, Double> beforeStudentMap = classroom.getStudyMap();
        double currentTimeWorkd = educator.getTimeWorked();
        // Person teacher = classroom.getInstructors().findById(1);
        double numberOfHours = 10;
        classroom.hostLecture(educator, numberOfHours);

        //then
        double hoursToBeAddedToStudent = numberOfHours/classroom.getStudents().count();

        for (Person s : classroom.getStudents()) {
            double beforeTotalStudyTimeForStudent = beforeStudentMap.get(s);
            Assert.assertEquals(beforeTotalStudyTimeForStudent+hoursToBeAddedToStudent, ((Student)s).getTotalStudyTime(), 0);
        }
        Assert.assertEquals(currentTimeWorkd+numberOfHours, educator.getTimeWorked(),1);
    }

}
