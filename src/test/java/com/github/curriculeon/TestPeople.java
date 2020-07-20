package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    public void testAdd(Person person1, Person person2, Person person3){
        // When
        ArrayList<Person> expected = new ArrayList<Person>();
        expected.add(person1); expected.add(person2); expected.add(person3);
        People people = new People();

        //Then
        people.add(person1); people.add(person2); people.add(person3);

        Person[] actual = people.toArray();
        Assert.assertEquals(expected.toArray(), actual);
    }

    @Test
    public void test(){
        Person person = new Person(1, "Person1");
        Person person2 = new Person(2, "Person2");
        Person person3 = new Person(3, "Person3");
        testAdd(person,person2,person3);
    }
    @Test
    public void testRemove(){
        People people = new People();
        Person person = new Person(1, "Person1");
        Person person2 = new Person(2, "Person2");
        Person person3 = new Person(3, "Person3");
        people.add(person);
        people.add(person2);
        people.add(person3);

        people.remove(person);
        ArrayList<Person> expected = new ArrayList<Person>();
        expected.add(person2); expected.add(person3);

        Person[] actual = people.toArray();
        Assert.assertEquals(expected.toArray(),actual);


    }

    @Test
    public void testFindById(){
        People people = new People();
        Person person = new Person(1, "Person1");
        Person person2 = new Person(2, "Person2");
        Person person3 = new Person(3, "Person3");
        people.add(person);
        people.add(person2);
        people.add(person3);

        Assert.assertEquals(person,people.findById(1));
        Assert.assertEquals(person2,people.findById(2));

    }

}



