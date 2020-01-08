package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents{
    @Test
    public void testGetInstance() {
        //given
        String[] studentList = new String[]{"Jack", "Jenny", "Justin", "John", "Julia"};
        //when
        Students students = Students.getInstance();

        // then
        for (int i=1; i<studentList.length+1;i++) {
            Assert.assertEquals(studentList[i-1], students.findById(i).getName());
        }

    }


}
