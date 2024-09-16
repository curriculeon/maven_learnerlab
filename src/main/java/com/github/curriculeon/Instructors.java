package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Deprecated
public class Instructors extends People<Instructor> {
    static final Instructors instance = new Instructors();
    private Instructors() {
        String[] names = {"Abbott", "Apollo", "Armani", "Aristotle", "Arrow"};
        long[] id = {1, 2, 3, 4, 5};
        Instructor instructor;
        for (int i = 0; i < names.length; i++) {
            instructor = new Instructor(id[i], names[i]);
            personList.add(instructor);
        }
    }
        public static Instructors getInstance(){
            return instance;
        }
    @Override
    public Instructor[] toArray() {
        Instructor[] instructor = new Instructor[personList.size()];
        return (Instructor[]) this.personList.toArray(instructor);
    }
    }
