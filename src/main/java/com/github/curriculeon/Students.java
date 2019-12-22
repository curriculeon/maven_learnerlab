package com.github.curriculeon;

public final class Students extends People{

    private static final Students instance = new Students();

    private People people;

    private Students()
    {
        people = new People();

        Student student1 = new Student(1, "John", 10);
        people.add(student1);
        Student student2 = new Student(2, "Alice", 20);
        people.add(student2);
        Student student3 = new Student(3, "Eve", 30);
        people.add(student3);
        Student student4 = new Student(4, "Bob", 40);
        people.add(student4);
        Student student5 = new Student(5, "Jim", 50);
        people.add(student5);
    }

    public static Students getInstance(){
        return instance;
    }

    public Student getById(long id)
    {
        return (Student) people.findById(id);
    }
}
