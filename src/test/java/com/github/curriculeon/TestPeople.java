package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        // given
        People people = Instructors.getInstance();
        Person person1 = new Person();

        Assert.assertFalse(people.contains(person1));

        // when
        people.add(person1);

        // then
        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void testRemove() {
        // given
        People people =  Instructors.getInstance();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertTrue(people.contains(person3));

        // when
        people.remove(person1);
        people.remove(person2);
        people.remove(person3);

        // then
        Assert.assertFalse(people.contains(person1));
        Assert.assertFalse(people.contains(person2));
        Assert.assertFalse(people.contains(person3));
    }

    @Test
    public void testFindById() {
        // given
        People people =  Instructors.getInstance();
        people.removeAll();
        Person expected = new Person(0L, null);
        people.add(expected);
        Assert.assertTrue(people.contains(expected));

        // when
        Person actual = people.findById(expected.getId());

        // then
        Assert.assertEquals(expected, actual);
    }
}