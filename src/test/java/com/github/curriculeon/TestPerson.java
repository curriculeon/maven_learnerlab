package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        //Given
        Long expectedId = 4212121L;
        String expectedName = "SomeName";
        // When
        Person person = new Person(expectedId, expectedName);

        // Then
        String actualName = person.getName();
        Long actualId = person.getId();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSetName() {
        // Given
        String expectedName = "SomeName";
        Person person = new Person(null,null);

        // When
        person.setName(expectedName);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expectedName, actual);
    }
}
