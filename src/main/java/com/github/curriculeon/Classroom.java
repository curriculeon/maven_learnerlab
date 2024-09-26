package com.github.curriculeon;

import java.util.HashMap;

/* Create a `Classroom` singleton.
        * The class should declare a field that references the instance of `Students` called `students`.
        * The class should declare a field that references the instance of `Instructors` called `instructors`.
        * The class should define a method `hostLecture` which makes use of a `Teacher teacher, double numberOfHours` parameter to host a `lecture` to the composite `personList` field in the `students` reference.
        * The class should define a method `hostLecture` which makes use of a `long id, double numberOfHours` parameter to identify a respective `Instructor` to host a `lecture` to the composite `personList` field in the `cohort` reference.
        * The class should define a method `getStudyMap` which returns a <u>new instance</u> of a _mapping_ from `Student` objects to `Double` objects, representative of each respective student's `totalStudyTime`.
*/
public class Classroom {
    private  Students students;
    private  Instructors instructors;
    private static Classroom CLASSROOM;

    private Classroom(){
        this.students=Students.getInstance();
        this.instructors=Instructors.getInstance();
    }
    public static Classroom getInstance(){
        if (CLASSROOM!=null){
        return CLASSROOM;}
        else{
            CLASSROOM=new Classroom();
            return CLASSROOM;
        }
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

        teacher.lecture(students.toArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher=instructors.findById(id);
        teacher.lecture(students.toArray(),numberOfHours);
    }
    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student,Double> result=new HashMap<>();
        for (Student st:students) {
            result.put(st, st.getTotalStudyTime());

        }
        return result;
    }
}
