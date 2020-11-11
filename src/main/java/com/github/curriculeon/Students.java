package com.github.curriculeon;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(0L, "JC Avalo"));
        add(new Student(0L, "Neely Mann"));
        add(new Student(0L, "Brian Lovelace"));
        add(new Student(0L, "Brant Campbell"));
        add(new Student(0L, "Michal Terranova"));
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

}
