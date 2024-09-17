package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a TestPeople class.
Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.

 */
public class PeopleTest {
    Person p1=new Person(1,"Tom");
    Person p2=new Person(2,"Larry");
    Person p3=new Person(3,"Gush");
    Person p4=new Person(4,"Dare");
    ArrayList pp =new ArrayList (Arrays.asList(p1,p2,p3));
    People people= Instructors.getInstance();



    private void testAdd(boolean tru) {

        // Given
       people.add(p4);


        // Then
        Assert.assertTrue(people.personList.contains(p4));

    }

    private void testRemove(boolean tru) {
        // Given

        people.removePerson(1L);
        // Then
        Assert.assertFalse(people.personList.contains(p1));

    }

    private void testFindByID(boolean tru) {
        // Given
        String expected="Leon";

        // Then

        Assert.assertEquals(people.findByID(1L).getName(),expected);
    }


    @Test
    public void test1() {
        testAdd(true);
    }

    @Test
    public void test2()
    {testRemove(true);}

    @Test
    public void test3(
    ){
        testFindByID(true);
    }

}