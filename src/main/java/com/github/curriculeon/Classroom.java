package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public class Classroom {

    private static final Classroom INSTANCE = new Classroom();
    Students students=Students.getInstance();
    Instructors instructors=Instructors.getInstance();

    private Classroom() {

    }


    public static Classroom getInstance() {
        return INSTANCE;
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture( students.toArray(),numberOfHours);

    }
    public void hostLecture(long id, double numberOfHours){
        Instructor instructor=instructors.findById(id);
        instructor.lecture( students.toArray(),numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> studentMap=new HashMap<>();

        for(Student student1 : students.toArray()) {
            Double studyTime =student1.getTotalStudyTime();
            studentMap.put(student1,studyTime);
        }
        return studentMap;
    }


}


