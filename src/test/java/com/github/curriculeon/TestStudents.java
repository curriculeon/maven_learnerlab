package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;
/**
 * Create a TestStudents class.
 * Create a test method which ensures that each of the students in your current cohort
 * are in your Students singleton.
 */

/**
 * Implemented by Monica Deshmukh 07/24/2020
 */
public class TestStudents {
    @Test
    public void testStudents() {
        //given
        Students students = Students.getInstance();
        Person[] studentCohort = {  new Person(1, "student1"),
                                    new Person(2, "student2"),
                                    new Person(3, "student3")};
        //when
        Person[] studentArray = students.toArray();

        //then
        for (int i = 0; i< 3; i++){
            Assert.assertEquals(studentArray[0].getId(), studentCohort[0].getId());
            //Assert.assertTrue(students.contains(studentCohort[i])); : physical Person objects are different, their properties are same
        }
    }
    
}
