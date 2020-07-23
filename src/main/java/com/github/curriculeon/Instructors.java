package com.github.curriculeon;
/*
Use Part 7 as a reference.
Create a Instructors singleton which represents the set of instructors.
Create a TestInstructors class.

 */


import java.util.ArrayList;

public class Instructors extends People {
    ArrayList<Instructor> personList=new ArrayList<Instructor>();
    final static Instructors instance = new Instructors();
    String [] cohort = new String[]{"Leon","Haseeb"};
    private Instructors(){
        super();

        for(Instructor instructor:peopleMaker(cohort)){
            this.personList.add(instructor);
        }
    }

    public static Instructors getInstance(){
        return instance;
    }

    public ArrayList<Instructor> peopleMaker(String[] names){
        ArrayList<Instructor> people=new ArrayList<Instructor>();
        for(int i =0;i<names.length;i++){
            people.add(studentMaker(Long.valueOf(i+1), names[i]));
        }
        return people;
    }

    public Instructor studentMaker(Long id,String name){
        Person student =new Student(id,name);

        return new Instructor(id,name);
    }
    @Override
    public Instructor findByID(Long id) {
        for (Instructor instructor : this.personList) {
            if (id == instructor.getId()) return instructor;
        }
        return null;
    }
}
