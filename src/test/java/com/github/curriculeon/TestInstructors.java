package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void test() {
        Instructors instructors = Instructors.getInstance();
        List<String> expectedNames = Arrays.asList("Leon Hunter", "someone");
        for(Person instructor : instructors.toArray()) {
            Assert.assertTrue(expectedNames.contains(instructor));
        }
    }
}
