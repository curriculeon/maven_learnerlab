package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public final class Students extends People<Student> {

    final static Students INSTANCE = new Students();
    private Students(){
        Student student1 = new Student(1, "Marcus");
        Student student2 = new Student(2, "Yuru");
        Student student3 = new Student(3,"David");
        this.add(student1);
        this.add(student2);
        this.add(student3);
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] tempArray = new Student[this.count()];
        int i = 0;
        for (Student student : this) {
            tempArray[i] = student;
            i++;
        }
        return tempArray ;
    }

}
