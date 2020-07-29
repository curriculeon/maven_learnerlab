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
       /* Student[] studentCohort = {  new Student(1, "student1"),
                                    new Student(2, "student2"),
                                    new Student(3, "student3")};*/
        //when
        //Person[] studentArray = students.toArray();
        Student[] studentArray = students.toArray();

        //then
        for (int i = 1; i<= 3; i++){
            Assert.assertEquals(studentArray[i-1].getId(), i);
            //
            //Assert.assertEquals(studentArray[0].getId(), studentCohort[0].getId());
            //Assert.assertTrue(students.contains(studentCohort[i])); : physical Person objects are different, their properties are same
        }
    }
    
}
