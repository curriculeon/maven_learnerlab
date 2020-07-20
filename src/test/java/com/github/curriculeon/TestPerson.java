package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestPerson {
    
    //Start Constructor
    
    //End Constructor

    //Start Methods
    @Test
    public void testConstructor(){
        Assert.assertNotNull(new Person(5L, "BOB"));
    }
    
    @Test
    public void testSetName(){
        Person person = new Person(5L, "BOB");
        person.setName("Tom");
        Assert.assertEquals("Tom", person.getName());
    }
    //End Methods
}
