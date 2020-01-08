package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {
    @Test
    public void TestIstructors(){
        //given
        String[] instructorsNames = new String[]{"Leon", "Ali", "Lenny"};
        //When
        int          expectedSize     =instructorsNames.length;
        int          actualSize       =Instructors.getInstance().count();
        List<String> instructorsInstance =new ArrayList<>();
        for (Object st:Instructors.getInstance().toArray()) {
            Instructor st1=(Instructor) st;
            instructorsInstance.add(st1.getName());
        }
        //then
        Assert.assertEquals(expectedSize,actualSize);
        Assert.assertArrayEquals(instructorsNames,instructorsInstance.toArray());
    }
}

