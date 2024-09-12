package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Students extends People<Student>{

    private static final Students instance = new Students();

    private List<Student> students;

    private Students()
    {
        students = new ArrayList();

        Student student1 = new Student(1, "John", 10);
        students.add(student1);
        Student student2 = new Student(2, "Alice", 20);
        students.add(student2);
        Student student3 = new Student(3, "Eve", 30);
        students.add(student3);
        Student student4 = new Student(4, "Bob", 40);
        students.add(student4);
        Student student5 = new Student(5, "Jim", 50);
        students.add(student5);
    }

    @Override
    public Student[] toArray() {

        Student[] result = new Student[students.size()];

        for(int i = 0; i < students.size(); i++)
            result[i] = students.get(i);

        return result;
    }

    public static Students getInstance(){
        return instance;
    }

    public Student getById(long id)
    {

        Student result = null;
        for (Student student: students){
            if (student.getId() == id) {
                result = student;
                break;
            }
        }
        return result;
    }

    public Iterator iterator()
    {
        Iterator iterator = students.iterator();
        return iterator;
    }
}
