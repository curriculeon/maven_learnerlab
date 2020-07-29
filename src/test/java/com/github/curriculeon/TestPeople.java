package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create a TestPeople class.
 * Create a testAdd method which ensures that our personList in our People class
 * populated with respective Person objects following invokation of the add method.
 * Create a testRemove method which ensures that the personList in a People object
 * is depopulated with a respective Person object following the invokation of the remove method.
 * Create a testFindById method which ensures that a respective Person object with a respective id field
 * is returned upon invokation of the findById method on a respective People object.
 */
public class TestPeople {
   @Test
    public void testAdd() {
       //given
       //People people = new People();
        People people = Students.getInstance();

        //when
       Person person1 = new Person(1, "person1");
       Person person2 = new Person(2, "person2");
       Person person3 = new Person(3, "person3");
       people.add(person1);
       people.add(person2);
       people.add(person3);

        //then
        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));
        Assert.assertTrue(people.contains(person3));
    }

    @Test
    public  void testRemove() {
        //given
        //People people = new People();
        People people = Instructors.getInstance();

        //when
        //add two persons to the list.
        //make sure they are added to the list.
        //then remove a person from the list.
        Person person1 = new Person(1, "person1");
        Person person2 = new Person(2, "person2");
        people.add(person1);
        people.add(person2);

        Assert.assertTrue(people.contains(person1));
        Assert.assertTrue(people.contains(person2));

        people.remove(person1);

        //then
        //assert that the person is removed from the list
        Assert.assertFalse(people.contains(person1));
    }

    @Test
    public void testFindById() {
        //given
        //People people = new People();
        People people = Students.getInstance();
        //when
        long id = 1;
        /*Person person1 = new Person(1, "person1");
        Person person2 = new Person(2, "person2");
        Person person3 = new Person(3, "person3");
        people.add(person1);
        people.add(person2);
        people.add(person3);*/
        //then
        Assert.assertTrue(people.contains(people.findById(id)));

        //when
        id = 4;
        //then
        Assert.assertFalse(people.contains(people.findById(id)));

        //when
        people = Instructors.getInstance();
        id = 11;

        //then
        Assert.assertTrue(people.contains(people.findById(id)));

    }
}
