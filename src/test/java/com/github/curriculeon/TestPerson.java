package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    public void testConstructor(long expectedId, String expectedName) {
        //Given
        Person person = new Person(expectedId, expectedName);
        //When
        long actualId = person.getId();
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    public void testSetName(String expectedName) {
        //Given
        long someId = 123456789;
        Person person = new Person(someId, expectedName);
        //When
        person.setName(expectedName);
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor0() {
        testConstructor(0, null);
    }

    @Test
    public void testConstructor1() {
        testConstructor(123456, "John");
    }

    @Test
    public void testConstructor2() {
        testConstructor(1234567, "Jane Doe");
    }

    @Test
    public void testConstructor3() {
        testConstructor(123456789, "It's a beautiful morning");
    }

    @Test
    public void testSetName0() {
        testSetName(null);
    }

    @Test
    public void testSetName1() {
        testSetName("John");
    }

    @Test
    public void testSetName2() {
        testSetName("Jane Doe");
    }

    @Test
    public void testSetName3() {
        testSetName("It's beautiful morning");
    }
}

