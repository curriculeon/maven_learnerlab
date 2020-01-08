package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
        String[] names = {"Abbott", "Apollo", "Armani", "Aristotle", "Arrow"};
        long[] id={1,2,3,4,5};
        String actual = "true";
        Instructors instructors= Instructors.getInstance();
        for(int i=0; i < names.length; i++){
            if(!instructors.personList.contains(new Instructor(id[i], names[i])))
            {
                actual = "false";
                break;
            }
        }
        Assert.assertTrue(actual, true);
    }
}
