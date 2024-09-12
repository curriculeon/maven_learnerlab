package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test() {
        //Given
        Instructors instance = Instructors.getInstance();

        //When
        //Then
        for(int i = 0; i < instance.count(); i++) {
            Assert.assertTrue(instance.findById(i) instanceof Instructor);
        }
    }
}
