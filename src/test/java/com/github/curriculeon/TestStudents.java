
package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestStudents {

    @Test
    public void test() {
        Students students = Students.getInstance();
        String[] studentNameArray = {"Chris", "William", "Adam"};
        List<String> studentNameList = Arrays.asList(studentNameArray);

        Person[] studentArray = students.toArray();
        for (Person person: studentArray) {
            boolean hasPersonWithName = studentNameList.contains((person.getName()));
            Assert.assertTrue(hasPersonWithName);
        }

    }



}
