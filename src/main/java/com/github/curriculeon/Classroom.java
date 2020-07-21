package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getINSTANCE();

    public void hostLecture(Teacher teacher, double numOfHours){
     teacher.lecture(students.toArray(),numOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
      Instructor instructorToHostLecture = instructors.findById(id);
       hostLecture(instructorToHostLecture, numberOfHours);
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
