package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private final static Classroom instance = new Classroom();
    private Students students = Students.getINSTANCE();
    private  Instructors instructors = Instructors.getINSTANCE();

    public static Classroom getClassroom(){
        return instance;
    }

    public void hostLecture(Teacher teacher, Double numbersOfHours){
        teacher.lecture(students.toArray(), numbersOfHours);

    }


    public void hostLecture(Long id, Double numberOfHours){
        Person person = instructors.findById(id);
        Instructor instructor = (Instructor)person;
        instructor.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> result = new HashMap<>();
        for (Person studentAsperson : students.toArray()) {
            Student student = (Student)studentAsperson;
            Double studyTime = student.getTotalStudyTime();
        }
        return result;
    }

}
