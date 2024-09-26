package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;
public class TestPerson {

    private void testConstructor(long expectedLong, String expectedString){
        Person person = new Person(expectedLong, expectedString);

        long actualLong = person.getId();
        String actualString = person.getName();

        Assert.assertEquals(expectedLong, actualLong);
        Assert.assertEquals(expectedString, actualString);
    }

    public void testSetName(String expectedString){
        Person person = new Person();

        person.setName(expectedString);
        String actualString = person.getName();

        Assert.assertEquals(expectedString, actualString);

    }

    @Test
    public void test0(){
        testConstructor(1, "Marcus");
    }

    @Test
    public void test1(){
        testSetName("Marcus Katalenas");
    }

    @Test
    public void test2(){
        testSetName("");
    }
}
