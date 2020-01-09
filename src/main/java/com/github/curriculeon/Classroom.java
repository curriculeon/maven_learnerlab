package com.github.curriculeon;

public class Classroom {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private static final  Classroom instance = new Classroom();
    private Classroom() {
        this.students = students;
        this.instructors = instructors;
    }
    public static Classroom getInstance() {
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public double getStudyMap() {
        return 0;
    }

}
