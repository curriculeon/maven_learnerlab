package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople extends People<Person> {
    public void testAdd(Person person1, Person person2, Person person3){
        // When
        ArrayList<Person> expected = new ArrayList<Person>();
        expected.add(person1); expected.add(person2); expected.add(person3);
        //Then
        this.add(person1); this.add(person2); this.add(person3);

        Person[] actual = this.toArray();
        Assert.assertEquals(expected.toArray(), actual);
        this.removeAll();
    }

    @Test
    public void test(){
        Person person = new Person(1, "Person1");
        Person person2 = new Person(2, "Person2");
        Person person3 = new Person(3, "Person3");
        testAdd(person,person2,person3);
    }
    @Test
    public void testRemove() {

        Person person = new Person(1, "Person1");
        Person person2 = new Person(2, "Person2");
        Person person3 = new Person(3, "Person3");
        this.add(person);
        this.add(person2);
        this.add(person3);

        this.remove(person);
        ArrayList<Person> expected = new ArrayList<Person>();
        expected.add(person2); expected.add(person3);

        Person[] actual = this.toArray();
        Assert.assertEquals(expected.toArray(),actual);
        this.removeAll();


    }

    @Test
    public void testFindById(){
        Person person = new Person(1, "Person1");
        Person person2 = new Person(2, "Person2");
        Person person3 = new Person(3, "Person3");
        this.add(person);
        this.add(person2);
        this.add(person3);

        Assert.assertEquals(person,this.findById(1));
        Assert.assertEquals(person2,this.findById(2));
        this.removeAll();

    }

    @Override
    public Person[] toArray() {
        Person[] tempArray = new Person[this.count()];
        int i = 0;
        for (Person person : this) {
            tempArray[i] = person;
            i++;
        }
        return tempArray ;
    }
}



