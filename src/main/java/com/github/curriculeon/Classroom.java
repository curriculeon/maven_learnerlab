package com.github.curriculeon;
/* Create a `Classroom` singleton.
        * The class should declare a field that references the instance of `Students` called `students`.
        * The class should declare a field that references the instance of `Instructors` called `instructors`.
        * The class should define a method `hostLecture` which makes use of a `Teacher teacher, double numberOfHours` parameter to host a `lecture` to the composite `personList` field in the `students` reference.
        * The class should define a method `hostLecture` which makes use of a `long id, double numberOfHours` parameter to identify a respective `Instructor` to host a `lecture` to the composite `personList` field in the `cohort` reference.
        * The class should define a method `getStudyMap` which returns a <u>new instance</u> of a _mapping_ from `Student` objects to `Double` objects, representative of each respective student's `totalStudyTime`.
*/
public class Classroom {
    private final static Students students=Students.getInstance();
    private final static Instructors instructors=Instructors.getInstance();

    private Classroom(){

    }

    public  void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[])students.toArray(),numberOfHours);
    }

    public  void hostLecture(long id, double numberOfHours){
        Teacher teacher=(Teacher) instructors.findById(id);
        teacher.lecture((Learner[])students.toArray(),numberOfHours);
    }
}
