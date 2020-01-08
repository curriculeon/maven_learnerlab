package com.github.curriculeon;


public class Students extends People<Student>{
    static final Students instance = new Students();

    private Students(){
        String[] names = {"Abbott", "Apollo", "Armani", "Aristotle", "Arrow"};
        long[] id ={1,2,3,4,5};
        double totalStudyTime = 5;
        Student student;
        for(int i=0; i < names.length; i++){
            student = new Student(id[i],names[i], totalStudyTime);
            personList.add(student);
        }
    }


    public static Students getInstance(){
        return instance;
    }

    @Override
    public Student[] toArray() {
        Student[] student = new Student[personList.size()];
        return (Student[]) this.personList.toArray(student);
    }
}
