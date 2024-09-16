package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople{

    @Test
    public void testAdd() {
        //given
        Person expectedPerson1 = new Person(1111L, "John Doe");
        Person expectedPerson2 = new Person(2222L, "Jane Doe");
        Person expectedPerson3 = new Person(3333L, "Dennis Doe");

        //when
        People personList = new People();
        personList.add(expectedPerson1);
        personList.add(expectedPerson2);
        personList.add(expectedPerson3);

        //then
        Assert.assertTrue(personList.contains(expectedPerson1));
        Assert.assertTrue(personList.contains(expectedPerson2));
        Assert.assertTrue(personList.contains(expectedPerson3));
    }

    @Test
    public void testRemove() {
        //given
        Person Person1 = new Person(1111L, "John Doe");
        Person Person2 = new Person(2222L, "Jane Doe");
        Person Person3 = new Person(3333L, "Dennis Doe");

        People personList = new People();
        personList.add(Person1);
        personList.add(Person2);
        personList.add(Person3);

        Assert.assertTrue(personList.contains(Person1));
        Assert.assertTrue(personList.contains(Person2));
        Assert.assertTrue(personList.contains(Person3));

        //when
        personList.remove(Person1);
        personList.remove(Person2);
        personList.remove(Person3);

        //then
        Assert.assertFalse(personList.contains(Person1));
        Assert.assertFalse(personList.contains(Person2));
        Assert.assertFalse(personList.contains(Person3));
    }

    @Test
    public void testFindById () {
        //given
        Person expectedPerson1 = new Person(1111L, "John Doe");
        Person expectedPerson2 = new Person(2222L, "Jane Doe");
        Person expectedPerson3 = new Person(3333L, "Dennis Doe");

        People personList = new People();
        personList.add(expectedPerson1);
        personList.add(expectedPerson2);
        personList.add(expectedPerson3);

        //when
        Person actualPerson1 = personList.findById(1111L);
        Person actualPerson2 = personList.findById(2222L);
        Person actualPerson3 = personList.findById(3333L);

        //then
        Assert.assertEquals(expectedPerson1, actualPerson1);
        Assert.assertEquals(expectedPerson2, actualPerson2);
        Assert.assertEquals(expectedPerson3, actualPerson3);
    }
}
