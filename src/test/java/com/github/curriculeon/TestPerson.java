package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalLong;

// Create a TestPerson class.
public class TestPerson {
    @Test
    // Create a testConstructor method
    // to ensure that a Person object's id and name field are being set upon construction.
    public void testConstructor() {
        // given
        Long expectedId = 0L;
        String expectedName = "Some name";

        // when
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    // Create a testSetName method
    // ensure that a Person object's name variable is being set by invoking the .setName method.
    public void testSetName() {
        // given
        Person person = new Person(null, null);
        String expectedName = "Some name";
        Assert.assertNotEquals(expectedName, person.getName());

        // when
        person.setName(expectedName);
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}