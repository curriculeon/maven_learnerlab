package com.github.curriculeon;

import java.util.Map;
import java.util.HashMap;

public enum Classroom {

    INSTANCE;
    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getINSTANCE();

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours) {
        Person instructor = instructors.findById(id);
        Person[] studentArray = new Student[students.count()];
        students.personList.toArray(studentArray);
        ((Teacher)instructor).lecture((Learner[])studentArray, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentMap = new HashMap<>();
        for(Student student: students.getArray()) {
            studentMap.put(student, student.getTotalStudyTime());
        }
        return studentMap;
    }
}
