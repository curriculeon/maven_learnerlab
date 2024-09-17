package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by leon on 7/15/2020.
 */
public class TestPerson {
    @Test
    public void testConstructor() {
    //given
    Long expectedId = 0L;
    String expectedName = "Some Name";

        // When
        Person person = new Person(expectedId, expectedName);

        // Then
        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testSetName() {
        // given
        Person person = new Person(null, null);
        String expectedName = "Some Name";
        Assert.assertNotEquals(expectedName, person.getName());

        // when
        person.setName(expectedName);
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);
    }
}