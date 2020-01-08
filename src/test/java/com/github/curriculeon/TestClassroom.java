package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class TestClassroom {
    @Test
    public void testHostLecture(){
        String actual = "true";
        double numberOfHours =5;
        Teacher teacher = new Instructor(10, "Jaba");
        Classroom classroom = new Classroom();
        double[] total = new double[classroom.students.personList.size()];
        for(int i=0; i< classroom.students.personList.size(); i++){
            Student stu = classroom.students.personList.get(i);
            total[i]=  stu.totalStudyTime+ numberOfHours;
        }
        classroom.hostLecture(teacher, numberOfHours);
        for(int i=0; i< classroom.students.personList.size(); i++){
            Student stu = classroom.students.personList.get(i);
            if(stu.totalStudyTime != total[i]){
               actual ="false";
            }
        }

        Assert.assertTrue(actual, true);
    }
    @Test
    public void testHostLectureEducator(){
        String actual = "true";
        double numberOfHours =5;
        Educator educator = Educator.Apollo;
        Classroom classroom = new Classroom();
        double[] total = new double[classroom.students.personList.size()];
        for(int i=0; i< classroom.students.personList.size(); i++){
            Student stu = classroom.students.personList.get(i);
            total[i]=  stu.totalStudyTime+ numberOfHours;
        }
        classroom.hostLecture(educator, numberOfHours);
        for(int i=0; i< classroom.students.personList.size(); i++){
            Student stu = classroom.students.personList.get(i);
            if(stu.totalStudyTime != total[i]){
                actual ="false";
            }
        }

        Assert.assertTrue(actual, true);
    }
}
