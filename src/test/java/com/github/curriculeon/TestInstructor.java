package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean isTeacher = instructor instanceof Teacher;

        //then
        Assert.assertTrue(isTeacher);
    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean isPerson = instructor instanceof Person;

        //then
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testTeach(){
        //given
        Student student = new Student(null, null);
        Instructor instructor = new Instructor(null, null);
        double preStudyTime = student.getTotalStudyTime();
        double lectureTime = 10.0;
        double expectedStudyTime = preStudyTime + lectureTime;

        //when
        instructor.teach(student, lectureTime);
        double actualStudyTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
    }

    @Test
    public void testLecture(){
        //given
        Student student1 = new Student(null, null);
        Student student2 = new Student(null, null);
        Student student3 = new Student(null, null);
        Student student4 = new Student(null, null);
        Student[] students = new Student[]{student1, student2, student3, student4};
        Instructor instructor = new Instructor(null, null);
        double lectureTime = students.length;
        double expectedStudyTime = lectureTime/ students.length;
        for(Student student : students){
            Assert.assertNotEquals(expectedStudyTime, student.getTotalStudyTime());
        }

        //when
        instructor.lecture(students, lectureTime);
        for(Student student : students) {
            double actualStudyTime = student.getTotalStudyTime();

            //then
            Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
        }
    }
}
