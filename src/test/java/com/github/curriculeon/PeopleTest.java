package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void testAdd() {
        //given
        Person expectedPerson1 = new Person(8888L, "Tom Jones");
        Person expectedPerson2 = new Person(7777L, "Cindy Weatherspoon");
        Person expectedPerson3 = new Person(5555L, "Sarah Kraut");

        //when
        People personList = Instructors.getINSTANCE();
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
        Person Person1 = new Person(8888L, "Tom Jones");
        Person Person2 = new Person(7777L, "Cindy Weatherspoon");
        Person Person3 = new Person(5555L, "Sarah Kraut");

        People personList = Instructors.getINSTANCE();
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
        Person expectedPerson1 = new Person(8888L, "Tom Jones");
        Person expectedPerson2 = new Person(7777L, "Cindy Weatherspoon");
        Person expectedPerson3 = new Person(5555L, "Sarah Kraut");

        People personList = Students.getINSTANCE();
        personList.add(expectedPerson1);
        personList.add(expectedPerson2);
        personList.add(expectedPerson3);

        //when
        Person actualPerson1 = personList.findById(8888L);
        Person actualPerson2 = personList.findById(7777L);
        Person actualPerson3 = personList.findById(5555L);

        //then
        Assert.assertEquals(expectedPerson1, actualPerson1);
        Assert.assertEquals(expectedPerson2, actualPerson2);
        Assert.assertEquals(expectedPerson3, actualPerson3);
    }
}

