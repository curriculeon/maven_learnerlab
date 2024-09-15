package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InstructorsTest extends TestCase {


    @Test
    public void testGetInstance() {
        Instructors instructor = Instructors.getInstance();
        String[] instructorNameArray = {"Leon", "Haseeb"};
        List<String> listInstructor = Arrays.asList(instructorNameArray);

        Person[] instructorArray = instructor.toArray();
        for (int i = 0; i < instructorArray.length; i++) {
            Person person = instructorArray[i];
            String personName = person.getName();
            boolean hasPersonWithName = listInstructor.contains(personName);
            Assert.assertTrue(hasPersonWithName);

        }
    }

}
