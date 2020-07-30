package com.github.curriculeon;

public class Students extends People {
    private static final Students INSTANCE = new Students();
    //private Map<Integer, String> mates = new HashMap<Integer, String>();
    // tried to use a hash map.

    People myColleagues = new People();
    private Students(){

        Student firstStudent = new Student(10l, "Christopher");
        Student secondStudent = new Student(15l, "David");
        myColleagues.add(secondStudent);
        myColleagues.add(firstStudent);

    }

    public static Students getINSTANCE(){
        return INSTANCE;
    }
}
