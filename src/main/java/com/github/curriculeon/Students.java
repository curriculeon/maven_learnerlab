package com.github.curriculeon;

import java.util.List;

public class Students extends People {

    private static Students INSTANCE;

    private Students() { }

    public static Students getINSTANCE() {
        if(INSTANCE == null) { //lazy loading, as opposed to eager loading
            INSTANCE = new Students();
            INSTANCE.add(new Student(555, "Molly Fisher", 0D));
            INSTANCE.add(new Student(777, "Holly Becker", 0D));
            INSTANCE.add(new Student(999, "Brad Singer", 0D));
        }
        return INSTANCE;
    }


}