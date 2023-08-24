package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person test = new Person(1L, "Leon");

        String expected = "Leon";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        Person test = new Person(1L, "Leon");

        test.setName("Noel");

        String expected = "Noel";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }
}
