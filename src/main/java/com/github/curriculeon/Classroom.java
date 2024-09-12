package com.github.curriculeon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Classroom {

    private static final Classroom instance = new Classroom();

    private Students students;
    private Instructors instructors;
    private Map<Student, Double> map;

    private Classroom(){
        map = new HashMap<>();
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static Classroom getInstance()
    {
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours)
    {
        for (Student student: students.toArray()) {
            teacher.teach(student, numberOfHours);
            map.put(student, student.getTotalStudyTime());
        }

    }

    public void hostLecture (long id, double numberOfHours)
    {
        hostLecture(instructors.getById(id), numberOfHours);
    }

    public Map<Student, Double> getStudyMap ()
    {
        return map;
    }
}
