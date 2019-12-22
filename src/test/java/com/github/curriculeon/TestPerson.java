package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor()
    {
        //given
        Person person;

        //when
        person = new Person(1, "John");

        //then
        Assert.assertEquals(1, person.getId());
        Assert.assertEquals("John", person.getName());
    }

    @Test
    public void testSetName ()
    {
        //given
        Person person = new Person(2, "Eve");

        //when
        person.setName("Alice");

        //then
        Assert.assertEquals("Alice", person.getName());
    }


}
