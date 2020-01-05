package com.github.curriculeon;

import org.junit.Assert;

public class TestPerson {
    public void testConstructor() {
        Person person = new Person();
        Assert.assertEquals(person, new Person());
    }

   public void testSetName() {
        String newName = "John";
       Person person = new Person();
       person.setName(newName);
       Assert.assertEquals(person.name, newName);
    }

}
