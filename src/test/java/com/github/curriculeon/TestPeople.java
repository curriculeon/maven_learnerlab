package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        // given
        People people = new People();
        Person personToAdd = new Person(null, null);
        Assert.assertFalse(people.contains(personToAdd));

        // when
        people.add(personToAdd);

        // then
        Assert.assertTrue(people.contains(personToAdd));
    }

    @Test
    public void testRemove() {
        // given
        People people = new People();
        Person preExistingPerson = new Person(null, null);
        people.add(preExistingPerson);
        Assert.assertTrue(people.contains(preExistingPerson));

        // when
        people.remove(preExistingPerson);

        // then
        Assert.assertFalse(people.contains(preExistingPerson));
    }

    @Test
    public void testFindById() {
        // given
        People people = new People();
        Long expectedId = Long.MAX_VALUE;
        Person expected = new Person(expectedId, null);
        people.add(expected);
        Assert.assertTrue(people.contains(expected));

        // when
        Person actual = people.findById(expectedId);

        // then
        Assert.assertEquals(expected, actual);
    }
}
