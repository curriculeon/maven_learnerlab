package com.github.curriculeon;

public class Students extends People {

    private static Students INSTANCE;

    private static People cohort;

    private Students() {

    }

    public static Students getINSTANCE() {
        if(INSTANCE == null) { //lazy loading, as opposed to eager loading
            INSTANCE = new Students();
        }
        return INSTANCE;
    }

    public People getCohort() {
        if(cohort == null) { // lazy loading
            cohort = new People();
            Student student1 = new Student(555, "Molly Fisher", 0D);
            Student student2 = new Student(777, "Holly Becker", 0D);
            Student student3 = new Student(999, "Brad Singer", 0D);
            cohort.add(student1);
            cohort.add(student2);
            cohort.add(student3);
        }
        return cohort;
    }
}
