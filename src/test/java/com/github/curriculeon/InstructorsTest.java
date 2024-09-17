package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {


    private void testImplementation(boolean tru) {
        // Given
        Instructors students= Instructors.getInstance();
        String[] expected = new String[]{"Leon","Haseeb"};
        String[] actual=new String[expected.length];
        for(int i =0;i<students.personList.size();i++){
            actual[i]=students.personList.get(i).getName();
        }
        // Then

        Assert.assertEquals(actual,expected);
    }


    @Test
    public void test() {
        testImplementation(true);
    }


}
