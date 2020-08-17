package com.github.curriculeon;

public class Students extends People<Person> {
    private static final Students instance = new Students();

    private Students(){
        super();
        this.add(new Student(0L, "Chris"));
        this.add(new Student(1L, "William"));
        this.add(new Student(2L, "Adam"));
    }

    @Override
    public Person[] toArray() {
        return super.toArray();

        //        return personList.toArray(new Student[count()]);
    }

    public static Students getInstance(){
        return instance;
    }
}
