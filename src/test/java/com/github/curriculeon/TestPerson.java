package com.github.curriculeon;

import  com.github.curriculeon.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        //given

        //when
        Person person = new Person(1, "Jack");

        //then
        Assert.assertEquals(1, person.getId());
        Assert.assertEquals("Jack", person.getName());

    }
    @Test
    public void testSetName() {
        //given
        Person person = new Person(1, "Jack");

        //when
        person.setName("John");
        //then
        Assert.assertEquals("John", person.getName());
    }
}
