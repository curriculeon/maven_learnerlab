package com.github.curriculeon.models;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    People<Person> people = new People<Person>() {
        @Override
        public Person[] toArray() {
            return (Learner[]) this.personList.stream().toArray(Person[]::new);
        }
    };

    @Test
    public void testAdd() {
        Person personToAdd = new Person(null,null);
        Assert.assertFalse(people.contains(personToAdd));

        people.add(personToAdd);

        Assert.assertTrue(people.contains(personToAdd));
    }

    @Test
    public void testRemove() {
        Person preExistingPerson = new Person(null,null);
        people.add(preExistingPerson);
        Assert.assertTrue(people.contains(preExistingPerson));

        people.remove(preExistingPerson);

        Assert.assertFalse(people.contains(preExistingPerson));
    }

    @Test
    public void testFindById() {
        Long expectedId = Long.MAX_VALUE;
        Person expected = new Person(expectedId,null);
        people.add(expected);
        Assert.assertTrue(people.contains(expected));

        Person actual = people.findById(expectedId);

        Assert.assertEquals(expected, actual);
    }
}
