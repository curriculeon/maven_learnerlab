package com.github.curriculeon;

public class Students extends People {
    static final Students instance = new Students();
    private Students(){
        String[] names = {"Abbott", "Apollo", "Armani", "Aristotle", "Arrow"};
        long[] id ={1,2,3,4,5};
        Student student;
        for(int i=0; i < names.length; i++){
            student = (Student) new Person(id[i],names[i]);
            personList.add(student);
        }
    }


    public static Students getInstance(){
        return instance;
    }
}
