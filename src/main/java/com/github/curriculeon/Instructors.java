package com.github.curriculeon;

public class Instructors extends People{
    private static Instructors INSTANCE;
    private Instructors(){
        String[] InstructorsNames = new String[]{"Leon", "Alli", "Lenny"};
        for (long i = 0; i < InstructorsNames.length; i++) {
            String instructorName = InstructorsNames[(int)i];
            Instructor instructor = new Instructor(i, instructorName);
            super.add(instructor);
        }
    }

    public static Instructors getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }
        INSTANCE = new Instructors();
        return INSTANCE;
    }
}
