package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor() {

        //given
        Long expectedId = 5556668888L;
        String expectedName = "Tom Jones";
        Person person = new Person(expectedId, expectedName);

        //when
        Long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void testSetName() {

        //given
        String expectedName = "Tom Jones";
        Person person = new Person();

        //when
        person.setName(expectedName);
        String actualName = person.getName();

        //then
        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualName, expectedName);
    }
}
