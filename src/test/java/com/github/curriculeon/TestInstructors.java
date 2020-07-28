package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        //given
        Instructors instructors = Instructors.getInstance();
        Person[] instructorsExpected = {new Person(11, "instructor1"),
                                        new Person(12, "instructor2")};

        //when
        Person[] instructorsActual = instructors.toArray();

        //then
        for(int i = 0; i < 2; i++){
            Assert.assertEquals(instructorsExpected[i].getName(), instructorsActual[i].getName());
        }
    }
}
