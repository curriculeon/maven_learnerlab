package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(4, "Mike");
        String actual = "false";
        people.add(person);
        for(Object i: people.personList){
            if(i.equals(person)){
              actual = "true";
              break;
            }
        }
        Assert.assertTrue(actual, true);
    }
    @Test
    public void testRemove(){
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(4, "Mike");
        String actual = "true";
        people.add(person);
        people.remove(person);
        for(Object i: people.personList){
            if(i.equals(person)){
                actual = "false";
                break;
            }
        }
        Assert.assertTrue(actual, true);
    }
    @Test
    public void testFindById (){
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(4, "Mike");
        people.add(person);
        Person founded = people.findById(4);
        Assert.assertEquals(person, founded);
    }
}
