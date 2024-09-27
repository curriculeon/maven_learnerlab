package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Test;

public class TestInstructor extends TestCase {

    @Test
    public void testImplementation(){
        //given & when
        Instructor instructor = new Instructor(1, "test");

        //then
        assert instructor instanceof Teacher;
    }

    @Test
    public void testInheritance(){
        //given & when
        Instructor instructor = new Instructor(1, "test");

        //then
        assert instructor instanceof Person;
    }

    @Test
    public void testTeach() {
        //given
        Instructor instructor = new Instructor(1, "test");
        Student student = new Student(1, "test");

        //when
        double expected = 5;
        instructor.teach(student, expected);

        //then
        assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        //given
        Instructor instructor = new Instructor(1, "test");
        Student student1 = new Student(1, "test1");
        Student student2 = new Student(2, "test2");
        Student student3 = new Student(3, "test3");
        Student student4 = new Student(4, "test4");
        Student[] students = new Student[]{
            student1, student2, student3, student4
        };
        double numberOfHours = 50;
        double numberOfHoursPerStudent = numberOfHours / students.length;

        //when
        instructor.lecture(students, numberOfHours);

        //then
        for (Student student: students) {
            assertEquals(numberOfHoursPerStudent, student.getTotalStudyTime());
        }
    }
}