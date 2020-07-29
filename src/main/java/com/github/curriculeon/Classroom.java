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
        teacher.lecture((Learner[]) students.toArray(),numberOfHours);

    }
    public void hostLecture(long id, double numberOfHours){
        Teacher instructor=(Teacher)instructors.findById(id);
        instructor.lecture((Learner[]) students.toArray(),numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> studentMap=new HashMap<>();

        for(Person student1 : students.toArray()) {
            Student student=(Student)student1;
            Double studyTime =student.getTotalStudyTime();
            studentMap.put(student,studyTime);
        }
        return studentMap;
    }


}


