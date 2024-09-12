package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    INSTANCE;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private Classroom() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        hostLecture(instructors.findById(id), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentTotalTimeMap = new HashMap<>();
        for (Student currentStudent : students.toArray()) {
             studentTotalTimeMap.put(currentStudent, currentStudent.getTotalStudyTime());
        }
        return studentTotalTimeMap;
    }

    public static Classroom getInstance() {
        return INSTANCE;
    }
}
