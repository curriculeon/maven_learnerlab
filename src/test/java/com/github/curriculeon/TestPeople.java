package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        //given
        People people = new People();
        Person person = new Person(null, null);
        Assert.assertFalse(people.contains(person));

        //when
        people.add(person);

        //then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        //given
        People people = new People();
        Person person = new Person(null, null);
        people.add(person);
        Assert.assertTrue(people.contains(person));

        //when
        people.remove(person);

        //then
        Assert.assertFalse(people.contains(person));

    }

    @Test
    public void testRemoveById() {
        //given
        Long id = Long.MAX_VALUE;
        People people = new People();
        Person person = new Person(id, null);
        people.add(person);
        Assert.assertTrue(people.contains(person));

        //when
        people.remove(id);

        //then
        Assert.assertFalse(people.contains(person));

    }

    @Test
    public void testFindById() {
        //given
        Long id = Long.MAX_VALUE;
        People people = new People();
        Person expectedPerson = new Person(id, null);
        people.add(expectedPerson);
        Assert.assertTrue(people.contains(expectedPerson));

        //when
        Person actualPerson = people.findById(id);

        //then
        Assert.assertEquals(expectedPerson, actualPerson);

    }
}
