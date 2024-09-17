package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    //given
    public People test(Person... valuesToBeAdded) {
        People myList = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };

        for (Person p :valuesToBeAdded) {
            myList.add(p);
            Boolean myListContainsValue = myList.contains(p);
            Assert.assertTrue(myListContainsValue);
        }
        return myList;

    }

    Person person1 = new Person(1, "Jack");
    Person person2 = new Person(2, "Jenny");
    Person person3 = new Person(3, "John");
    People myPeopleList = test(person1, person2, person3);

    @Test
    public void testAdd() {
        //when
        Person person4 = new Person(4, "Justin");
        Boolean myListContainsValue = myPeopleList.contains(person4);
        Assert.assertFalse(myListContainsValue);
        myPeopleList.add(person4);
        //then
        myListContainsValue = myPeopleList.contains(person4);
        Assert.assertTrue(myListContainsValue);
    }

    @Test
    public void testRemove() {
        //when
        Boolean myListContainsValue = myPeopleList.contains(person3);
        Assert.assertTrue(myListContainsValue);
        myPeopleList.remove(person3);
        //then
        myListContainsValue = myPeopleList.contains(person3);
        Assert.assertFalse(myListContainsValue);
    }

    @Test
    public void testFindById() {
        //when
        Person person4 = new Person(4, "Justin");
        Assert.assertFalse(myPeopleList.contains(person4));    // check no person4 in the People list
        Assert.assertEquals(3, myPeopleList.count());   // check size of the list
        myPeopleList.add(person4);    // add person4
        Assert.assertEquals(4, myPeopleList.count());   // check the size is increased
        //then
        Person expectedperson = myPeopleList.findById(4);
        Assert.assertEquals(person4, expectedperson);
    }
}
