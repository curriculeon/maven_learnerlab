package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void test() {
        //given
        // current cohort

        String expectedStudentName1 = "Molly Fisher";
        String expectedStudentName2 = "Holly Becker";
        String expectedStudentName3 = "Brad Singer";

        //when
        Students cohort = Students.getINSTANCE();

        String actualStudentName1 = cohort.findById(555).getName();
        String actualStudentName2 = cohort.findById(777).getName();
        String actualStudentName3 = cohort.findById(999).getName();

        //then
        Assert.assertEquals(expectedStudentName1, actualStudentName1);
        Assert.assertEquals(expectedStudentName2, actualStudentName2);
        Assert.assertEquals(expectedStudentName3, actualStudentName3);
    }

}
