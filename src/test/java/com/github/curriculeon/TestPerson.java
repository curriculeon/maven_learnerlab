package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Test;

public class TestPerson extends TestCase {

    @Test
    public void testConstructor() {
        //given & when
        Long expectedID = 1L;
        String expectedName = "Ezra";
        Person guy = new Person(expectedID, expectedName);
        //then
        assertEquals(expectedID, guy.getId());
        assertEquals(expectedName, guy.getName());
    }

    @Test
    public void testSetName() {
        //given
        Person guy = new Person(0,"test");
        //when
        String expected = "Ezra";
        guy.setName(expected);
        //then
        assertEquals(expected, guy.getName());
    }
}