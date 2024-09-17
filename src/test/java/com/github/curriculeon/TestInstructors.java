package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testGetInstance() {
        //given
        String[] instructorList = new String[]{"Leon", "Ali", "Lenny"};
        //when
        Instructors instructors = Instructors.getInstance();

        // then
        for (int i=1; i<instructorList.length+1;i++) {
            Assert.assertEquals(instructorList[i-1], instructors.findById(i).getName());
        }

    }



}
