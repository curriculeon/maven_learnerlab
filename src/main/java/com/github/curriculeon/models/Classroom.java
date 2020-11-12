package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Learner;
import com.github.curriculeon.interfaces.Teacher;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    INSTANCE;
    private Students students;
    private Instructors instructors;

    Classroom() {
        this(Students.getInstance(), Instructors.getInstance());
    }

    Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long idOfInstructor, double numberOfHours) {
        Instructors instructorsSingleton = Instructors.getInstance();
        Teacher teacher = instructorsSingleton.findById(idOfInstructor);
        hostLecture(teacher,numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student student : Students.getInstance()) {
            Double totalStudyTime = student.getTotalStudyTime();
            map.put(student, totalStudyTime);
        }
        return map;
    }
}
