package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Create a TestStudents class
public class TestStudents {
        // Create a test method which ensures that
        // each of the students in your current cohort are in your Students singleton.
        @Test
        public void test() {
            Students students = Students.getInstance();
            String[] studentNameArray = {"Julia", "David Y", "Ghasan"};
            List<String> studentNameList = Arrays.asList(studentNameArray);

            Person[] studentArray = students.toArray();
            for (int i = 0; i < studentArray.length; i++) {
                Person person = studentArray[i];
                String personName = person.getName();
                boolean hasPersonWithName = studentNameList.contains(personName);
                Assert.assertTrue(hasPersonWithName);
            }
        }
}