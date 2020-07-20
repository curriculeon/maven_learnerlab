package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;
public class TestPerson {

    private void test(long expectedLong, String expectedString){
        Person person = new Person(expectedLong, expectedString);

        long actualLong = person.getId();
        String actualString = person.getName();

        Assert.assertEquals(expectedLong, actualLong);
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void test0(){
        test(1, "Marcus");
    }
}
