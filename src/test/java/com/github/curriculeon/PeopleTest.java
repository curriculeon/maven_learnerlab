package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;

public class PeopleTest extends TestCase {

    public void testAdd() {
        //given
        People people = Instructors.getInstance();
        Person person1 = new Person();
        Person person2 = new Person();
        Assert.assertFalse(people.contains(person1));
        Assert.assertFalse(people.contains(person2));

        //when
        people.add(person1);
        people.add(person2);

        //then
        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
    }

    public void testFindById() {
        //given
        People people = Instructors.getInstance();
        people.removeAll();
        Person expected = new Person(1L, null);
        Person person1 = new Person(2L, null);
        Person person2 = new Person(3L, null);

        Assert.assertFalse(people.contains(expected));
        Assert.assertFalse(people.contains(person1));
        Assert.assertFalse(people.contains(person2));

        //when
        people.add(expected);
        people.add(person1);
        people.add(person2);

        Assert.assertTrue(people.contains(expected));
        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));

        Person actual = people.findById(expected.getId());
        //then
        Assert.assertEquals(expected, actual);

    }

    public void testRemove() {
        //given
        People people = Instructors.getInstance();
        Person person1 = new Person();
        Person person2 = new Person();


        people.add(person1);
        people.add(person2);

        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));

        //when
        people.remove(person1);
        people.remove(person2);

        //then
        Assert.assertFalse(people.contains(person1));
        Assert.assertFalse(people.contains(person2));

    }
}