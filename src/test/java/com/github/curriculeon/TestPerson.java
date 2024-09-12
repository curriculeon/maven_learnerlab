package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    private void testConstructor(long expectedId, String expectedName) {
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();
        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actualName, expectedName);
    }

    private void testSetName(String expectedName) {
        Person person = new Person();
        person.setName(expectedName);
        String actualName = person.getName();
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
     public void testConstructor0() {
        testConstructor(0, null);
    }

    @Test
    public void testConstructor1() {
        testConstructor(234122, "Johnny");
    }

    @Test
    public void testConstructor2() {
        testConstructor(3260, "Zack");
    }

    @Test
    public void testConstructor3() {
        testConstructor(1, "Dona");
    }

    @Test
    public void testConstructor4() {
        testConstructor(4320, "Ryan");
    }

    @Test
    public void testSetName0() {
        testSetName(null);
    }

    @Test
    public void testSetName1() {
        testSetName("Tom");
    }

    @Test
    public void testSetName2() {
        testSetName("Jerry");
    }

    @Test
    public void testSetName3() {
        testSetName("Mack");
    }

    @Test
    public void testSetName4() {
        testSetName("Alan");
    }

}
