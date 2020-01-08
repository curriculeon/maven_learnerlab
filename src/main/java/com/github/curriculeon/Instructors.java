package com.github.curriculeon;

public class Instructors extends People<Instructor>{
    private static Instructors INSTANCE;
    private Instructors(){
        super.add(Educator.LEON.getInstructor());
        super.add(Educator.ALI.getInstructor());
        super.add(Educator.LENNY.getInstructor());


    }

    public static Instructors getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }
        INSTANCE = new Instructors();
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] instructors=new Instructor[INSTANCE.count()];
int i=0;
            for (Instructor instr:INSTANCE) {
                instructors[i]=instr;
                i++;
            }


        return instructors;
    }
}
