package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public class Classroom  {
    Students students;
    Instructors instructors;

    public Classroom(){
        this(Students.getINSTANCE(),Instructors.getINSTANCE());
    }

    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;

    }

    public void hostLecture(Teacher teacher, double numOfHours){
        teacher.lecture(students.toArray(),numOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
      hostLecture(instructors.findById(id), numberOfHours);
 }

   public Map<Student,Double> getStudyMap(){
        Map<Student,Double> tempMapping = new HashMap<Student,Double>();
        Student[] tempStudents = new Student[students.count()];
        tempStudents =  students.toArray();
       for (Student student: tempStudents)
           tempMapping.put(student,student.getTotalStudyTime());
       return tempMapping;
    }
}
