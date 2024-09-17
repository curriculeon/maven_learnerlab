package com.github.curriculeon;

public class Classroom {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture((Learner[])students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours) {
        Person person = instructors.findById(id);
        Instructor instructor = (Instructor)person;
        instructor.lecture((Learner[])students.toArray(), numberOfHours);
    }

}
