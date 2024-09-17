package com.github.curriculeon;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Classroom {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private Map<Student, Double> totalStudyTime = new HashMap<>();


    private static final  Classroom instance = new Classroom();
    private Classroom() {
        this.students = students;
        this.instructors = instructors;
    }
    public static Classroom getInstance() {
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        /*Person[] persons = students.toArray();
        Learner[] learners = new Learner[persons.length];
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            Learner learner = (Learner)person;
            learners[i] = learner;
        }*/
        Learner[] learners = students.toArray();
        teacher.lecture(learners, numberOfHours);




    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        for(Person s: students) {
            totalStudyTime.put((Student) s, ((Student)s).getTotalStudyTime());
        }
        return totalStudyTime;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Map<Student, Double> getTotalStudyTime() {
        return totalStudyTime;
    }
}
