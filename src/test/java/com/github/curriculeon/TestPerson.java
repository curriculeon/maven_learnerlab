package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Objects;

public class TestPerson {
    @Test
    public void testConstructor() {
        String actual = "false";
        Person person = new Person(3, "John");
        if(person.name != null && !Objects.equals(person.id, null)){
            actual = "true";
        }
        Assert.assertTrue(actual, true);
    }
   @Test
   public void testSetName() {
        String newName = "John";
       Person person = new Person(2, newName);
       person.setName(newName);
       Assert.assertEquals(person.name, newName);
    }

}
