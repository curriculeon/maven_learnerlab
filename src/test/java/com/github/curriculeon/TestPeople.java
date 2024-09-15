package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

// Create a TestPeople class
public class TestPeople {

    // Create a testAdd method which ensures that our personList in our People class
    // populated with respective Person objects following invocation of the add method.
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


    // Create a testRemove method which ensures that the personList in a People object
    // is depopulated with a respective Person object following the invocation of the remove method.
    @Test
    public void testRemove() {
        // given
        People people = Instructors.getInstance();
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

    // Create a testFindById method which ensures that a respective Person object with a respective id field
    // is returned upon invocation of the findById method on a respective People object.
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
