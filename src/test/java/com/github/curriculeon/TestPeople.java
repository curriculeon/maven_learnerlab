package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    /**?
     * Credits to Leon Christopher Hunter for all the help in building this project.
     * Without Leon there would be no java project by me.
     */

    @Test
    public void testAdd(){
        //Given
        People people = Instructors.getINSTANCE();

        Person people1 = new Person();
        Assert.assertFalse(people.contains(people1));

        //When
        people.add(people1);
        //Then

        Assert.assertTrue(people.contains(people1));
    }

    @Test
    public void testRemove(){
        //Given
        People people = Instructors.getINSTANCE();
        Person people1 = new Person();
        Person people2 =new Person();

        people.add(people1);
        people.add(people2);

        Assert.assertTrue(people.contains(people1));
        Assert.assertTrue(people.contains(people2));

        //When
        people.remove(people1);
        people.remove(people2);

        //Then
        Assert.assertFalse(people.contains(people1));
        Assert.assertFalse(people.contains(people2));
    }

    @Test
    public void testFindById() {
        //Given
        People people = Instructors.getINSTANCE();
        Person expected = new Person(22l, "Emmanuel");
        Person people2 =new Person(23l, "Johnson");

        people.add(expected);
        people.add(people2);

        Assert.assertTrue(people.contains(expected));
        Assert.assertTrue(people.contains(people2));

        //When
        Person actual = people.findById(22l);


        //Then
        Assert.assertEquals(expected, actual);
    }

}
