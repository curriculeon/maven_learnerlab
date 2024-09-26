package com.github.curriculeon;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Classroom {
    
    //Attributes
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();
    private static final Classroom INSTANCE = new Classroom();
    
    //Start Constructors
    private Classroom() {
    
    }
    //End Constructors
    
    //Start Methods
    public static Classroom getInstance() {
        return INSTANCE;
    }
    
    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }
    
    public void hostLecture(long id, double numberOfHours) {
        instructors.findById(id).ifPresent(person -> {
            person.lecture(students.toArray(), numberOfHours);
        });
    }
    
    public void hostLecture(Educator teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }
    
    public Map<Student, Double> getStudyMap() {
        return StreamSupport.stream(students.spliterator(), false).collect(Collectors.toMap(student -> student, Student::getTotalStudyTime));
    }
    //End Methods
}
