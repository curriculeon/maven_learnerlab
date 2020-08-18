package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        //Given
        Person person = new Person(null, null);
        People people = Instructors.getInstance();
        // When
        Assert.assertFalse(people.contains(person));
        people.add(person);

        // Then
        Assert.assertTrue(people.contains(person));

    }

    @Test
    public void testRemove() {
        //Given
        Person person1 = new Person(1L, null);
        People people1 = Instructors.getInstance();

        // When
        people1.add(person1);
        Assert.assertTrue(people1.contains(person1));
        people1.remove(person1);
        // Then
        Assert.assertFalse(people1.contains(person1));

    }

    @Test
    public void testFindById() {
        //Given
        Person person1 = new Person(1L, null);
        People people1 = Instructors.getInstance();
        people1.removeAll();
        // When
        people1.add(person1);
        Person actualPerson = people1.findById(1L);
        // Then
        Assert.assertEquals(person1,actualPerson);

    }
}