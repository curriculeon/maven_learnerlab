package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
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