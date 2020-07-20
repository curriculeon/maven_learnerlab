package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    public void testConstructor(long expectedId, String expectedName) {
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test0() {
        testConstructor(0, null);
    }
}

