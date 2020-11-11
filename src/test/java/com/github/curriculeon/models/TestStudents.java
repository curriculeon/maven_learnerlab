package com.github.curriculeon.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void test() {
        String[] nameArray = "Neely Mann,Michal Terranova,Bilikis".split(",");
        List<String> nameList = Arrays.asList(nameArray);

        for (Person person: Students.getInstance()) {
            String personName = person.getName();

            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
