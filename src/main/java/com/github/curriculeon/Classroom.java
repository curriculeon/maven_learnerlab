package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

// Create a Classroom singleton.
public enum Classroom {
    INSTANCE;
    // The class should declare a field that references the instance of Students called students.
    private Students students = Students.getInstance();
    // The class should declare a field that references the instance of Instructors called instructors.
    private Instructors instructors = Instructors.getInstance();

    // The class should define a method hostLecture
    // which makes use of a Teacher teacher, double numberOfHours parameter
    // to host a lecture to the composite personList field in the students reference.
    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }
    // The class should define a method hostLecture
    // which makes use of a long id, double numberOfHours parameter
    // to identify a respective Instructor to host a lecture to the composite personList field in the cohort reference.
    public void hostLecture(long id, double numberOfHours) {
        Teacher instructor = instructors.findById(id);
        instructor.lecture(students.toArray(), numberOfHours);
    }
    // The class should define a method getStudyMap
    // which returns a new instance of a mapping from Student objects to Double objects,
    // representative of each respective student's totalStudyTime.
    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new HashMap<>();
        for(Student student : students.toArray()) {
            Double studyTime = student.getTotalStudyTime();
            result.put(student, studyTime);
        }
        return result;
    }
}