package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){

        //given
        Long expectedId=0L;
        String expectedName="Some name";



        //when
        //Giving the object we want to test, test when the constructor is called
        Person person = new Person(expectedId, expectedName);
        //Checking if actual output is same as expected
        String actualName=person.getName();
        Long actualId=person.getId();


        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }
}
