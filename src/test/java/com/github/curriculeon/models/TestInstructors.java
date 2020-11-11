package com.github.curriculeon.models;

import com.github.curriculeon.interfaces.Learner;
import com.github.curriculeon.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void test() {
        String[] nameArray = "Leon,Fred,David".split(",");
        List<String> nameList = Arrays.asList(nameArray);

        for (Person person: Instructors.getInstance()) {
            String personName = person.getName();

            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
