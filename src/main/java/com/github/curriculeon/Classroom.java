package com.github.curriculeon;

public enum Classroom {
    INSTANCE;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture (Teacher teacher, double numberOfHours{
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public void hostLecture (long id, Double numberOfHours){
        Teacher instructor = instructors.findById(id);
        instructor.lecture((Learner[]) students.toArray(), numberOfHours);
    }


}
