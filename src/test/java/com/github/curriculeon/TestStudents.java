package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudents {

    @Test
    public void testConstructor() {
        //given
        String[] expectedNames = "Jarek,Andrew,Mary".split(",");

        //when
        List<String> nameList = Arrays
                .stream(Students.getInstance().toArray())
                .map(student -> student.getName())
                .collect(Collectors.toList());

        //then
        for(String expectedName : expectedNames){
            Assert.assertTrue(nameList.contains(expectedName));
        }

    }
}
