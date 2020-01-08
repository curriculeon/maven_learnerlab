package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    private void TestAdd(Person person){
        //given
        People people= new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        //When
        people.add(person);
        int expectedSize=1;
        int actualSize=people.count();
        boolean isContains=people.contains(person);

        //then
        Assert.assertTrue(isContains);
        Assert.assertEquals(expectedSize,actualSize);

    }

    @Test
    public void TestAdd0(){
        Person person=new Person(1,"Kate");
        TestAdd(person);
    }

    @Test
    public void TestAdd1(){
        Person person=new Person(5,"Pit");
        TestAdd(person);
    }

    private void TestRemove(Person person){
        //given
        People people=new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        //When
        Person person1=new Person(3,"Wendy");
        people.add(person1);
        people.add(person);
        people.remove(person);
        int expectedSize=1;
        int actualSize=people.count();
        boolean isContains=people.contains(person);

        //then
        Assert.assertTrue(!isContains);
        Assert.assertEquals(expectedSize,actualSize);

    }

    @Test
    public void TestRemove0(){
        Person person=new Person(1,"Kate");
        TestRemove(person);
    }

    @Test
    public void TestRemove1(){
        Person person=new Person(5,"Pit");
        TestRemove(person);
    }

    private void TestFindById(long id){
        //given
        People people=new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person1=new Person(3,"Wendy");
        Person person=new Person(id,"Pit");
        Person person2=new Person(1,"Kate");
        //When

        people.add(person1);
        people.add(person);
        people.add(person2);
        long expectedId=id;
        Person personResult=people.findById(id);
        long actualId=personResult.getId();
        boolean isContains=people.contains(person);

        //then
        Assert.assertTrue(isContains);
        Assert.assertEquals(person,personResult);

    }

    @Test
    public void TestFindById0(){
        TestFindById(21);
    }

    @Test
    public void TestFindById1(){
        TestFindById(8);
    }
}
