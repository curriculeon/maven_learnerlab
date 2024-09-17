package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void test() {
        //given
       Students students = Students.getInstance();
        String[] studentNameArray = {"Student A", "Student B", "Student C"};
        List<String> studentNameList = Arrays.asList(studentNameArray);

        //when
        Person[] studentArray = students.toArray();
        for(int i = 0; i < studentArray.length; i++) {
            Person person = studentArray[i];
            String personName = person.getName();
            boolean hasPersonWithName = studentNameList.contains(personName);

            //then
            Assert.assertTrue(hasPersonWithName);
        }
    }

}
