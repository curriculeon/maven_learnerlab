package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void testStudents(){
        //given
        String[] namesArray = "JC Avalo,Neely Mann,Brian Lovelace,Brant Campbell, Michal Terranova".split(",");
        List<String> nameList = Arrays.asList(namesArray);
        //when
        for(Person person : Students.getINSTANCE()){
            String personName = person.getName();
            //then
            Assert.assertTrue(nameList.contains(personName));
        }
    }
}
