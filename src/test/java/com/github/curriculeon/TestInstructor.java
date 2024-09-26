package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    /* Create a `TestInstructor` class.
            * Create a `testImplementation` method that asserts that an `Instructor` is an `instanceof` a `Teacher`.
            * Create a `testInheritance` method that asserts that a `Instructor` is an `instanceof` a `Person`.
            * Create a `testTeach` method that ensures when an `Instructor` invokes the `teach` method, a respective student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.
            * Create a `testLecture` method that ensures when an `Instructor` invokes the `lecture` method, a respective array of students' `totalStudyTime` instance variables is incremented by `numberOfHours/students.length`.
*/
    @Test
    public void TestImplementation(){
        //given
        Instructor instructor=new Instructor(1,"Jane");
        //when
        Boolean isInstanceOfInstructor=instructor instanceof Instructor;
        //then
        Assert.assertTrue(isInstanceOfInstructor);
    }

    @Test
    public void TestInheritence(){
        //given
        Instructor instructor=new Instructor(1,"Jane");
        //when
        Boolean isInstanceOfPerson=instructor instanceof Person;
        //then
        Assert.assertTrue(isInstanceOfPerson);
    }

    private void TestTeach(double addValue){
        //given
        Instructor instructor=new Instructor(1,"Jane");
        Student student=new Student(1,"Jane",5);
        //when
        double expectedValue=5+addValue;
        instructor.teach(student, addValue);
        double actualValue=student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedValue,actualValue,0);
    }

    private void TestLecture(double addValue){
        //given
        Instructor instructor=new Instructor(1,"Jane");
        Student[] students=new Student[]{
                new Student(1,"Jane",5),
                new Student(2,"Steve",8)
        };
        //when
        instructor.lecture(students,addValue);
        double addValuePerSt=addValue/students.length;
        double [] expected={5+addValuePerSt,8+addValuePerSt};
        double[] actual=new double[2];
        int i=0;
        for (Student student: students){
         actual[i]=student.getTotalStudyTime();
         i++;}
        //then
        Assert.assertArrayEquals(expected,actual,0);
    }
    @Test

    public void TestTeach0(){
        TestTeach(2.0);
    }

    @Test

    public void TestTeach1(){
        TestTeach(4.0);
    }

    @Test

    public void TestTeach2(){
        TestTeach(11.0);
    }

    @Test
    public void TestLecture0(){
        TestLecture(4);
    }


    @Test
    public void TestLecture1(){
        TestLecture(7);
    }
}
