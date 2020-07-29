package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        //given
        Instructors instructors = Instructors.getInstance();
        Instructor[] instructorsExpected = {new Instructor(11, "instructor1"),
                                        new Instructor(12, "instructor2")};

        //when
        Person[] instructorsActual = instructors.toArray();

        //then
        for(int i = 0; i < 2; i++){
            Assert.assertEquals(instructorsExpected[i].getName(), instructorsActual[i].getName());
        }
    }
}
