package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test(){
        Students students = Students.getINSTANCE();
        String expected = "Marucs";
        String actual = students.students.findById(1).getName();
        Assert.assertEquals("Marcus",actual);
        actual = students.students.findById(2).getName();
        Assert.assertEquals("Yuru",actual);
        actual = students.students.findById(3).getName();
        Assert.assertEquals("David",actual);


    }
}
