
package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 7/27/2020.
 */
public class TestInstructors {
    @Test
    public void test() {
        Instructors instructors = Instructors.getInstance();
        List<String> expectedNames = Arrays.asList("Professor Peep", "Professor George");
        for(Person instructor : instructors.toArray()) {
            Assert.assertTrue(expectedNames.contains(instructor.getName()));
        }
    }
}