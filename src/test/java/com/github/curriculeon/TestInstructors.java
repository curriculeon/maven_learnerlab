package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void instructorsSingletonTest(){

        //Given
        Instructors instructor = Instructors.getINSTANCE();
        String expected = "Leon";

        //When
        String actual = instructor.findById(01l).getName();
        //Then

        Assert.assertEquals(expected, actual);
        actual = instructor.findById(02l).getName();
        Assert.assertEquals("Christel", actual);
    }

}
