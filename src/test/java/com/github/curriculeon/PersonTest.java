package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    
    //Start Constructor
    
    //End Constructor

    //Start Methods
    @Test
    public void testConstructor(){
        //given
        long id = 8L;
        String name = "bob";
        
        //when
        Person person = new Person(id, name);
        long actualId = person.getId();
        String actualName = person.getName();
        
        //then
        Assert.assertEquals(id, actualId);
        Assert.assertEquals(name, actualName);
    }
    
    @Test
    public void testSetName(){
        //given
        Person person = new Person(5L, "BOB");
        String newName = "Tom";
        Assert.assertNotEquals("BOB", "Tom");
        
        //when
        person.setName("Tom");
        String actualName = person.getName();
        
        //then
        Assert.assertEquals(newName, actualName);
    }
    //End Methods
}
