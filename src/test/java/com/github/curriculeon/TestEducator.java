package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testConstructor(){
        Instructors instructors = Instructors.getINSTANCE();
        Educator educator = Educator.HASEEB;
        double actual = educator.getTimeWorked();
        Assert.assertEquals(actual,0.0,0.0);


    }
}
