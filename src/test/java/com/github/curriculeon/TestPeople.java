package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        //given
    People peopleList = new People();
    Person person1 = new Person();

        //when
    peopleList.add(person1);

        //then
        Assert.assertTrue(peopleList.contains(person1));
    }

    @Test
    public void testRemove() {
        //given
        People peopleList = new People();
        Person person1 = new Person();
        peopleList.add(person1);
        Boolean expected = peopleList.contains(person1);

        //when
        peopleList.remove(person1);

        //then
        Assert.assertFalse(peopleList.contains(person1));
    }

    @Test
    public void testFindById() {
        //given
        People peopleList = new People();
        Person person1 = new Person(575L, "Joe");
        peopleList.add(person1);
        Boolean expected = peopleList.contains(person1);

        // when
        peopleList.findById(575L);

        //then
        Assert.assertTrue(peopleList.contains(peopleList.findById(575L)));


    }



}
