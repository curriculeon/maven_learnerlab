package com.github.curriculeon.models;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        Long expectedId = Long.MAX_VALUE;
        String expectedName = "Duke";

        Person person = new Person(expectedId, expectedName);

        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName() {
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "Neely";
        String originalName = "Duke";

        Person person = new Person(expectedId, originalName);
        person.setName(expectedName);

        Assert.assertEquals(expectedName, person.getName());

    }

}
