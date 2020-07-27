package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.Random;

public class PeopleTest {
    
    public static final Random RANDOM = new Random();
    
    @Test
    public void addTest() {
        //given
        People people = Students.getInstance();
        people.removeAll();
        int oldCount = people.count();
        
        //when
        Student student = new Student(RANDOM.nextInt(), "Bob");
    
        //then
        Assert.assertEquals(oldCount + 1, people.count());
    }
    
    @Test
    public void removeTest() {
        //given
        People people = Students.getInstance();
        people.removeAll();
        Student student = new Student(RANDOM.nextInt(), "Bob");
        int oldCount = people.count();
        
        
        //when
        people.remove(student.getId());
        
        //then
        Assert.assertEquals(oldCount - 1, people.count());
        Assert.assertFalse(people.contains(student));
    }
    
    @Test
    public void findByIdInTest() {
        //given
        People people = Students.getInstance();
        people.removeAll();
        Student student = new Student(1, "Bob");
        
        //when
        Optional<Person> opPerson = people.findById(student.getId());
        
        //then
        Assert.assertTrue(opPerson.isPresent());
    }
    
    @Test
    public void findByIdNotInTest() {
        //given
        People people = Students.getInstance();
        
        //when
        Optional<Person> opPerson = people.findById(99L);
        
        //then
        Assert.assertTrue(!opPerson.isPresent());
    }
}
