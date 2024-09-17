package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/*
Create a TestStudents class.
Create a test method which ensures that each of the students in your
current cohort are in your Students singleton.
 */
public class StudentsTest {

    private void testImplementation(boolean tru) {
        // Given
        Students students= Students.getInstance();
      String[] expected = new String[]{"David","Chris","Marcus","Leon","Mondira","Deepti","Steve","Yuru","Monica","Akila","Julia","David","Alonzo","Rachid","Emmanuel","Lionel","Solomon","People who don't speak"};
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

