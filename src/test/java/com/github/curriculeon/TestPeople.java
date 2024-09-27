package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople extends TestCase {

    @Test
    public void testAdd() {
        Person expectedPerson = new Person(22, "Ezra");
        People peopleList = new People();

        peopleList.add(expectedPerson);

        assertTrue(peopleList.contains(expectedPerson));
    }

    @Test
    public void testFindById() {
        Long expectedId = 5L;
        Person expectedPerson = new Person(expectedId, "Ezra");
        People peopleList = new People();
        peopleList.add(expectedPerson);

        assertEquals(expectedPerson.getId(), peopleList.findById(expectedId).getId());
    }

    @Test
    public void testRemove() {
        Person expectedPerson = new Person(7, "Ezra");
        People peopleList = new People();
        peopleList.add(expectedPerson);

        peopleList.remove(expectedPerson);

        assertFalse(peopleList.contains(expectedPerson));
    }
}