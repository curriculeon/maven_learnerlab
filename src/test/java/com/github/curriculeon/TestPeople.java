package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        //given
        People people = new People();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        //when
        people.add(person1);
        people.add(person2);
        people.add(person3);

        //then
        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertTrue(people.contains(person2));

    }

    @Test
    public void testRemove() {

        // given
        People people = new People();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        people.add(person1);
        people.add(person2);
        people.add(person3);

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

        //given
        People people = new People();
        Person person1 = new Person(0L, null);
        Person person2 = new Person(1L, null);
        Person person3 = new Person(2l, null);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertTrue(people.contains(person3));

        //when
        Person actual = people.findById(person1.getId());

        //then
        Assert.assertEquals(person1, actual);
    }
}
