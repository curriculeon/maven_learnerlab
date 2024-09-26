package com.github.curriculeon;

public class Students {
    final private static Students INSTANCE;

    private Students(){

    }

    static{
        try{
            INSTANCE = new Students();
        }
        catch(Exception e){
            throw new RuntimeException("Error in creating singleton instance");
        }
    }

    public static Students getInsatnce() {
        return INSTANCE;
    }
}
