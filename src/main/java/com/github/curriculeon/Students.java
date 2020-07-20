package com.github.curriculeon;

import java.util.List;

public final class Students extends People {

    final static Students INSTANCE = new Students();
    public People students = new People();
    private Students(){
        Student student1 = new Student(1, "Marcus");
        Student student2 = new Student(2, "Yuru");
        Student student3 = new Student(3,"David");
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }
}
