package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        // given
        long expectedId = 0L;
        String expectedName = "Some name";

        // when
        Person person = new Person(expectedId,expectedName);
        long actualId = person.getid();
        String actualName = person.getname();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testSetName() {
        // given
        Person person = new Person(0L, null);
        String expectedName = "Testing";



        // when
        person.setname(expectedName);
        String actualName = person.getname();

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}

