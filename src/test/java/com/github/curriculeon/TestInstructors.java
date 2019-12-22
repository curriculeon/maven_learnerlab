package com.github.curriculeon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInstructors {

    @Test
    public void testInstructors() {
        //given
        Instructors instructors = Instructors.getInstance();

        //when

        //then
        assertEquals("John", instructors.getById(1).getName());
        assertEquals("Alice", instructors.getById(2).getName());
        assertEquals("Eve", instructors.getById(3).getName());
        assertEquals("Bob", instructors.getById(4).getName());
        assertEquals("Jim", instructors.getById(5).getName());
    }
}
