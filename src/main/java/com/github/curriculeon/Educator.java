package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON,
    FRED,
    DAVID;

    private final Instructor instructor;
    private Double timeWorked;

    Educator(){
        this.instructor = new Instructor((long)ordinal(), name()){
            @Override
            public void teach(Learner learner, double numberOfHours) {
                super.teach(learner, numberOfHours);
                Educator.this.timeWorked += numberOfHours;
            }
        };
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }

    public Double getTimeWorked() {
        return timeWorked;
    }
}
