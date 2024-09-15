package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentsTest extends TestCase {

    @Test
    public void testGetInstance() {
        Students student = Students.getInstance();
        String[] studentNameArray = {"Anjali", "Deepti"};
        List<String> listStudent = Arrays.asList(studentNameArray);

        Person[] studentArray = student.toArray();
        for (int i = 0; i < studentArray.length; i++) {
            Person person = studentArray[i];
            String personName = person.getName();
            boolean hasPersonWithName = listStudent.contains(personName);
            Assert.assertTrue(hasPersonWithName);

        }
    }
}