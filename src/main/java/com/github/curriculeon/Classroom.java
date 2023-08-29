package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    INSTANCE;

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        Person[] personArray = students.toArray();
        Student[] studentArray = new Student[personArray.length];
        for (int i = 0; i < personArray.length; i++) {
            Person person = personArray[i];
            Student student = (Student) person;
            studentArray[i] = student;
        }
        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        Person person = Instructors.getInstance().findById(id);
        Teacher teacher = (Teacher) person;
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for(Person person : Students.getInstance().toArray()){
            Student student = (Student) person;
            double numberOfHours = student.getTotalStudyTime();
            map.put(student, numberOfHours);
        }
        return map;
    }
}
