package com.github.curriculeon;
import java.util.LinkedHashMap;
import java.util.Map;

public class Classroom{
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        teacher.lecture(students.toArray(), numberOfHours);
    }
    public Map<Student, Double> getStudyMap(Student student, Double totalStudyTime){
        Map<Student, Double> studyMap = new LinkedHashMap();
        studyMap.put(student, totalStudyTime);
        return studyMap;
    }
}
