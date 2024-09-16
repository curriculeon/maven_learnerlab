package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test(){
        String[] names = {"Abbott", "Apollo", "Armani", "Aristotle", "Arrow"};
        long[] id={1,2,3,4,5};
        double totalStudyTime =5;
        String actual = "true";
        Students students= Students.getInstance();
        for(int i=0; i < names.length; i++){
            if(!students.personList.contains(new Student(id[i], names[i], totalStudyTime)))
            {
                actual = "false";
                break;
            }
        }
        Assert.assertTrue(actual, true);
    }
}
