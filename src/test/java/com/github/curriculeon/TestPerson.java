package com.github.curriculeon;

/**
 * Create a TestPerson class.
 * Create a testConstructor method which ensures that a Person object's id and name field
 * are being set upon construction.
 */

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * Implemented by Monica Deshmukh
 * 07/20/2020
 */
public class TestPerson {
    private void testConstructor(long expectedId, String expectedName) {

        // When
        Person person = new Person(expectedId, expectedName);

        // Then
        long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void test0() {
        testConstructor(0, null);
    }

    @Test
    public void test1() {
        testConstructor(1, "Monica");
    }

    @Test
    public void test2() {
        testConstructor(2, "Deshmukh");
    }

}
