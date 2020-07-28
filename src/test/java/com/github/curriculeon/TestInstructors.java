package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

// Create a TestInstructors class.
public class TestInstructors {
    @Test
    // Create a test method which ensures that each of the instructors in your current cohort
    // are in your Instructors singleton.
    public void test() {
        Instructors instructors = Instructors.getInstance();
        List<String> expectedNames = Arrays.asList("Leon Hunter", "Haseeb Muhammad");
        for(Instructor instructor : instructors) {
            Assert.assertTrue(expectedNames.contains(instructor.getName()));
        }
    }
}
