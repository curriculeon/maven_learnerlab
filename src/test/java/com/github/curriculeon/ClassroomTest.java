package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ClassroomTest {
    
    @Test
    public void hostLectureTest() {
        //given
        Students students = Students.getInstance();
        List<Student> newStudents = IntStream.range(0, 10).boxed().map(id -> new Student(id, "Tom")).collect(Collectors.toList());
        Instructor instructor = new Instructor(99, "Bob");
        Instructors instructors = Instructors.getInstance();
        Classroom classroom = Classroom.getInstance();
        
        //when
        classroom.hostLecture(instructor, 50D);
        
        //then
        StreamSupport.stream(students.spliterator(), false).forEach(student->Assert.assertEquals(student.getTotalStudyTime(), 50D/students.count(), 0.0));
    }
}
