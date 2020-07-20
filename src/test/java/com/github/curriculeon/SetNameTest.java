package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class SetNameTest {
    private void test(String expected) {
        // Given
        Person person = new Person(2,"Bojangles");
        // When
      person.setName("Wendys");
      String actual=person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test1() {
        test("Wendys");
    }


}

