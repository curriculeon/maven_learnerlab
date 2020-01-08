package com.github.curriculeon;

public class Classroom {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private Classroom classroom;

    private Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public Classroom getInstance() {
        if (classroom==null)
            classroom = new Classroom(students, instructors);
        return classroom;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {

    }

    public double getStudyMap() {
        return 0;
    }

}
