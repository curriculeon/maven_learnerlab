package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //given
        Person personToAdd = new Person(null, null);
        People people = new People();
        Assert.assertFalse(people.contains(personToAdd));
        //when
        people.add(personToAdd);
        //then
        Assert.assertTrue(people.contains(personToAdd));
    }

    @Test
    public void testRemove(){
        //given
        Person personAdded = new Person(null, null);
        People people = new People();
        people.add(personAdded);
        Assert.assertTrue(people.contains(personAdded));
        //when
        people.remove(personAdded);
        //then
        Assert.assertFalse(people.contains(personAdded));
    }

    @Test
    public void testFindById(){
        //given
        People people = new People();
        Long expectedId = Long.MAX_VALUE;
        Person expected = new Person(expectedId, null);
        people.add(expected);
        Assert.assertTrue(people.contains(expected));
        //when
        Person actual = people.findById(expectedId);
        //then
        Assert.assertEquals(expected, actual);
    }
}
