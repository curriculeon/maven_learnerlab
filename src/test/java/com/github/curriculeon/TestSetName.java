package com.github.curriculeon;

/*** Create a testSetName method which ensures that a Person object's name variable is being set
 * by invoking the .setName method.
 */

import org.junit.Assert;
import org.junit.Test;

/** Implemented by Monica Deshmukh
 * 07/20/2020
 */
public class TestSetName {
    private void testSetName(String expectedName) {
        //given
        String name = expectedName + 1;   //initialize name to a different value than expectedName
        Person person = new Person(1, name);

        //when
        person.setName(expectedName);   //change the name using setName() method

        //then
        String actualName = person.getName();   //assert if the name is changed

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test0() {
        testSetName("Monica");
    }

    @Test
    public void test1() {
        testSetName("");
    }

    @Test
    public void test2() {
        testSetName(null);
    }
}


