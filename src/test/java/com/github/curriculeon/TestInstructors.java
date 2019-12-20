package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {
    @Test
    public void TestIstructors(){
        //given
        String[] instructorsNames = new String[]{"Leon", "Alli", "Lenny"};
        //When
        int          expectedSize     =instructorsNames.length;
        int          actualSize       =Instructors.getInstance().count();
        List<String> instructorsInstance =new ArrayList<>();
        for (Person st:Instructors.getInstance().toArray()) {
            instructorsInstance.add(st.getName());
        }
        //then
        Assert.assertEquals(expectedSize,actualSize);
        Assert.assertArrayEquals(instructorsNames,instructorsInstance.toArray());
    }
}

