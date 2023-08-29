package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();
        Person person = new Person(null, null);
        Assert.assertFalse(people.contains(person));

        people.add(person);

        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove(){
        People people = new People();
        Person person = new Person(null, null);
        people.add(person);
        Assert.assertTrue(people.contains(person));




    }
}
