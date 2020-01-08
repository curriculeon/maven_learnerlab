package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class TestStudents{
    @Test
    public void testGetInstance() {
        //given
        Students students = Students.getInstance();
        System.out.println(students.count());

        //  Assert.assertEquals("John", students.findById(4).getName());
       // System.out.println(students.count());
        //then
      //  Iterator itr = studentsInstance.iterator();
       // while (itr.hasNext()) {
           // System.out.println("KKKKK");
            //System.out.println(itr.next());
       // }
    }


}
