package com.github.curriculeon;

import java.util.*;

/**
 * Create a Classroom singleton.
 * The class should declare a field that references the instance of Students called students.
 * The class should declare a field that references the instance of Instructors called instructors.
 * The class should define a method hostLecture which makes use of a Teacher teacher,
 * double numberOfHours parameter to host a lecture
 * to the composite personList field in the students reference.
 * The class should define a method hostLecture which makes use of a long id,
 * double numberOfHours parameter to identify a respective Instructor
 * to host a lecture to the composite personList field in the cohort reference.
 * The class should define a method getStudyMap which returns a new instance of a mapping
 * from Student objects to Double objects, representative of each respective student's totalStudyTime.
*/

/* Refactor the hostLecture method in the Classroom class by removing any intermediate casting trick(s).*/

public class Classroom {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher;
        if (instructors.findById(id) instanceof Teacher) {
            teacher = (Teacher) instructors.findById(id);
            this.hostLecture(teacher, numberOfHours);
        }
    }

    public Map<Student,Double> getStudyMap(){
        Iterator<Student> iterator = students.iterator();
        Map<Student, Double> map = new HashMap<>();
        Student s ;

        while(iterator.hasNext()){
            //if (iterator.next() instanceof Student){
                //s = (Student)iterator.next();
                s = iterator.next();
                map.put(s, s.getTotalStudyTime());
            //}
        }
        return  map;
    }
}
