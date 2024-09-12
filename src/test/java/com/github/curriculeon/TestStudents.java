package com.github.curriculeon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudents {

    @Test
    public void testStudents() {
        //given
        Students students = Students.getInstance();

        //when

        //then
        assertEquals("John", students.getById(1).getName());
        assertEquals("Alice", students.getById(2).getName());
        assertEquals("Eve", students.getById(3).getName());
        assertEquals("Bob", students.getById(4).getName());
        assertEquals("Jim", students.getById(5).getName());
    }
}
