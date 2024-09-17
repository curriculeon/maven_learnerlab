package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {

    @Test
    public void test() {
        //given
        Instructors instructors = Instructors.getInstance();
        List<String> instructorNameList = Arrays.asList("Leon", "Haseeb");

        //when
        Person[] instructorArray = instructors.toArray();
        for(int i = 0; i < instructorArray.length; i++) {
            Person person = instructorArray[i];
            String personName = person.getName();
            boolean hasPersonWithName = instructorNameList.contains(personName);

            //then
            Assert.assertTrue(hasPersonWithName);
        }
    }
}
