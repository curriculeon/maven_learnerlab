package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {
    @Test
    public void TestStudents(){
        //given
        String[] studentNames = new String[]{"Tanya", "Kevin", "Sana","Chris","Pranathi","James"};
        //When
        int expectedSize=studentNames.length;
        int actualSize=Students.getInstance().count();
        List<String> studentsInstance=new ArrayList<>();
        for (Person st:Students.getInstance().toArray()) {
            studentsInstance.add(st.getName());
        }
        //then
        Assert.assertEquals(expectedSize,actualSize);
        Assert.assertArrayEquals(studentNames,studentsInstance.toArray());
    }
}
