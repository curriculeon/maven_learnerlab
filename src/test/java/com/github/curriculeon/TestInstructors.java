package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestInstructors {

    @Test
    public void testConstructor(){
        //given
        String[] expectedNames = "Leon,Hunter".split(",");

        //when
        List<String> nameList = Arrays
                .stream(Instructors.getInstance().toArray())
                .map(instructor -> instructor.getName())
                .collect(Collectors.toList());

        //then
        for(String expectedName : expectedNames){
            Assert.assertTrue(nameList.contains(expectedName));
        }

    }
}
