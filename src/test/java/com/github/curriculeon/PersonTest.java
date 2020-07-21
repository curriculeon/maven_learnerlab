package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    public void testConstructor(long expectedId, String expectedName) {

        Person person = new Person(expectedId, expectedName);

        long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actualName, expectedName);
    }

    public void testSetName(String expectedName) {

        Person person = new Person();

        person.setName(expectedName);
        String actualName = person.getName();

        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void testConst0() {
        testConstructor(555668888, "Ghassan Nasr");
    }

    @Test
    public void testSetName0() {
        testSetName("Ghassan nasr");
    }

}
