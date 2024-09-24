package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class TestInstructors {
    @Test
    public void test() {
        Instructors instructors = Instructors.getInstance();
        List<String> expectedNames = Arrays.asList("Leon Hunter", "Haseeb Muhammad");
        for(Instructor instructor : instructors) {
            Assert.assertTrue(expectedNames.contains(instructor.getName()));
        }
    }
}