package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    private void TestConstructor(int id,String name){
        //When
        Person myPerson=new Person(id, name);
        long actualId=myPerson.getId();
        String actualName=myPerson.getName();

        //Then
        Assert.assertEquals(id,actualId);
        Assert.assertEquals(name,actualName);
    }

    @Test
    public void TestConstructor0(){
        TestConstructor(1,"Josh");
    }

    @Test
    public void TestConstructor1(){
        TestConstructor(2,"Tanya");
    }

    @Test
    public void TestConstructor2(){
        TestConstructor(10,"Steve");
    }

    @Test
    public void TestConstructor3(){
        TestConstructor(101,"Kate");
    }

    private void TestSetName(String expectedName ){
        //When
        Person myPerson=new Person(0, null);
        myPerson.setName(expectedName);
        String actualName=myPerson.getName();

        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void TestSetName0(){
        TestSetName("John");
    }

    @Test
    public void TestSetName1(){
        TestSetName("Kate");
    }

    @Test
    public void TestSetName2(){
        TestSetName("Tanya");
    }


}


