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
        Person test = new Person(null, null);
        String expected = "Noel";

        Assert.assertNotEquals(test.getName(), expected);

        test.setName("Noel");

        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }
}
