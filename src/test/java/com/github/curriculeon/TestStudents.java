package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test() {
        // Given
        Students instance = Students.getInstance();

        //Then
        for(int i = 0; i < instance.count(); i++) {
            Assert.assertTrue(instance.findById(i) instanceof Student);
        }
    }
}
