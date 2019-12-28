package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People<Instructor>{
    private static final Instructors instance = new Instructors();

    private List<Instructor> instructors;

    private Instructors()
    {
        instructors = new ArrayList<>();

        final Instructor instructor1 = new Instructor(Educator.instructor1.getId(), Educator.instructor1.getName());
        instructor1.setTimeWorked(Educator.instructor1.getTimeWorked());
        instructors.add(instructor1);
        final Instructor instructor2 = new Instructor(Educator.instructor2.getId(), Educator.instructor2.getName());
        instructor2.setTimeWorked(Educator.instructor2.getTimeWorked());
        instructors.add(instructor2);
        final Instructor instructor3 = new Instructor(Educator.instructor3.getId(), Educator.instructor3.getName());
        instructor3.setTimeWorked(Educator.instructor3.getTimeWorked());
        instructors.add(instructor3);
        final Instructor instructor4 = new Instructor(Educator.instructor4.getId(), Educator.instructor4.getName());
        instructor4.setTimeWorked(Educator.instructor4.getTimeWorked());
        instructors.add(instructor4);
        final Instructor instructor5 = new Instructor(Educator.instructor5.getId(), Educator.instructor5.getName());
        instructor5.setTimeWorked(Educator.instructor5.getTimeWorked());
        instructors.add(instructor5);
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] result = new Instructor[instructors.size()];

        for (int i = 0; i < instructors.size(); i++)
            result[i] = instructors.get(i);

        return result;
    }

    public static Instructors getInstance(){
        return instance;
    }

    public Instructor getById(long id)
    {
        Instructor result = null;
        for (Instructor instructor: instructors){
            if (instructor.getId() == id) {
                result = instructor;
                break;
            }
        }
        return result;
    }
}
