package com.github.curriculeon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    private void testConstructor(long expectedLong, String expectedString){
        // : Given
        Person person = new Person(expectedLong, expectedString);


        // : When
        long actualLong = person.getId();
        String actualString = person.getName();

        // : Then
        assertEquals(expectedLong, actualLong);
        assertEquals(expectedString, actualString);

    }

 @Test
    public void test0(){ testConstructor(20, "abc"); }

@Test
    public void test1(){testConstructor(10, "Hello World");}


@Test
    public void testSetName(){
        //Given
        Person p = new Person(12l, "abced");

        // When
        String testName = "wwww";
        p.setName(testName);


    //then
        assertEquals(p.getName(), p.getName());

    }

}
