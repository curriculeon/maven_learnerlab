package com.github.curriculeon.models;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        People people = new People();
        Person personToAdd = new Person(null,null);
        Assert.assertFalse(people.contains(personToAdd));

        people.add(personToAdd);

        Assert.assertTrue(people.contains(personToAdd));
    }

    @Test
    public void testRemove() {
        People people = new People();
        Person preExistingPerson = new Person(null,null);
        people.add(preExistingPerson);
        Assert.assertTrue(people.contains(preExistingPerson));

        people.remove(preExistingPerson);

        Assert.assertFalse(people.contains(preExistingPerson));
    }

    @Test
    public void testFindById() {
        People people = new People();
        Long expectedId = Long.MAX_VALUE;
        Person expected = new Person(expectedId,null);
        people.add(expected);
        Assert.assertTrue(people.contains(expected));

        Person actual = people.findById(expectedId);

        Assert.assertEquals(expected, actual);
    }
}
