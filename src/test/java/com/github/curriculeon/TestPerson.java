package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        Long expectedId = 10L;
        String expectedName = "Leon";

        //when
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        //given
        String expectedName = "Leon";
        Person person = new Person(null, null);
        Assert.assertNotEquals(expectedName, person.getName());

        //when - the method that we are actually testing
        person.setName(expectedName);
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);
    }
}
