package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void test() {
        //given
        // current instructors

        //given
        // current cohort

        String expectedInstructorName1 = "Lincoln Barnes";

        //when
        Instructors instructors = Instructors.getINSTANCE();

        String actualInstructorName1 = instructors.findById(444).getName();

        //then
        Assert.assertEquals(expectedInstructorName1, actualInstructorName1);
    }

}
