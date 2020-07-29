package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        //Given
        Person person = new Person(234L, "Lionel");
        People people = Instructors.getInstance();

        //When
        people.add(person);

        //Then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        //Given
        Person person1 = new Person(234L, "Lionel");
        Person person2 = new Person(212L, "Ricky");
        Person person3 = new Person(546L, "Bryan");
        People people = Instructors.getInstance();

        //When
        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.remove(person2);

        //Then
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testFindById() {
        //Given
        Person person1 = new Person(234L, "Lionel");
        Person person2 = new Person(212L, "Ricky");
        Person person3 = new Person(546L, "Bryan");
        People people = Instructors.getInstance();

        //When
        people.add(person1);
        people.add(person2);
        people.add(person3);

        //Then
        for(Object person : people) Assert.assertTrue(people.contains(people.findById(((Person)person).getId())));
    }


}
