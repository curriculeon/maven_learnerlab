package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        long expectedId = 123456789;
        String expectedName= "Some name";
        double expectedStudyTime = 6;
       Student student =  new Student(expectedId, expectedName);
       student.learn(expectedStudyTime);
       student.getTotalStudyTime();
       double actualStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTime, actualStudyTime,123456789);
    }
}
