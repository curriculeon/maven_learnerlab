package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void test() {
        // given
        Students students = Students.getInstance();
        String[] studentNameArray = {"OneMore", "someone", "AnotherOne"};
        List<String> studentNameList = Arrays.asList(studentNameArray);
        Person[] studentArray = students.toArray();

        for (int i = 0; i < studentArray.length ; i++) {
            Person person1 = studentArray[i];
            String personName = person1.getName();
            boolean hasPeopleWithName = studentNameList.contains(personName);
            Assert.assertTrue(hasPeopleWithName);
        }
    }
}
