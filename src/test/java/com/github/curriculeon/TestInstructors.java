package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void test() {

        Instructors instructors = Instructors.getInstance();
        String[] instructorsArray = {"Leon Hunter", "Haseeb Muhammad"};
        List<String> studentNameList = Arrays.asList(instructorsArray);

        Instructor[] InstructorArray = instructors.toArray();
        for (Instructor instructor : InstructorArray) {
            boolean hasPersonWithName = studentNameList.contains((instructor.getName()));
            Assert.assertTrue(hasPersonWithName);
        }
    }
}
