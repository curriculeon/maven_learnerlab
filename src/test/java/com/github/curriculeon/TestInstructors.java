package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {

    @Before
    public void init(){
        Instructors.getInstance().personList.clear();
    }
    //given
    Instructor instructor1 = new Instructor(0L, "Leon Hunter");
    Instructor instructor2 = new Instructor(1L, "Fred Zirdung");
    Instructor instructor3 = new Instructor(2L, "David S");

    @Test
    public void test() {
        // given
        String[] nameArray = "Leon Hunter,Fred Zirdung,David S".split(",");
        List<String> nameList = Arrays.asList(nameArray);
        Instructors.getInstance().add(instructor1);
        Instructors.getInstance().add(instructor2);
        Instructors.getInstance().add(instructor3);
        // when
        Instructors instructorsSingleton = Instructors.getInstance();
        for(Instructor person : instructorsSingleton.personList) {
            String personName = person.getName();
            // then
            assert personName != null;
            Assert.assertTrue(nameList.contains(personName));
        }
    }

}
