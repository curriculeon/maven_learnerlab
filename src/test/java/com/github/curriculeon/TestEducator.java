package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void TestImplementation(){
        //given

        //when
        Boolean isInstanceOfInstructor=Educator.LEON instanceof Educator;
        //then
        Assert.assertTrue(isInstanceOfInstructor);
    }

    @Test
    public void TestInheritence(){
        //given
        Educator instructor=Educator.LENNY;

        //when
        Boolean isInstanceOfTeacher=instructor instanceof Teacher;
        //then
        Assert.assertTrue(isInstanceOfTeacher);
    }

    private void TestTeach(Educator instructor, double addValue){
        //given
        Student student=new Student(1,"Jane",5);
        //when
        double initialTimeWorked=instructor.getTimeWorked();
        double expectedValue=5+addValue;
        double expectedTimeWorked=initialTimeWorked+addValue;
        instructor.teach(student, addValue);
        double actualTimeWorked=instructor.getTimeWorked();
        double actualValue=student.getTotalStudyTime();
        //then

        Assert.assertEquals(expectedValue,actualValue,0);
        Assert.assertEquals(expectedTimeWorked,actualTimeWorked,0);
    }

    private void TestLecture(Educator instructor, double addValue){
        //given
        Student[] students=new Student[]{
                new Student(1,"Jane",5),
                new Student(2,"Steve",8)
        };
        //when
        double initialTimeWorked=instructor.getTimeWorked();
        instructor.lecture(students,addValue);

        double addValuePerSt=addValue/students.length;
        double [] expected={5+addValuePerSt,8+addValuePerSt};
        double[] actual=new double[2];
        int i=0;
        for (Student student: students){
            actual[i]=student.getTotalStudyTime();
            i++;}
        double expectedTimeWorked=initialTimeWorked+addValue;
        double actualTimeWorked=instructor.getTimeWorked();
        //then
        Assert.assertArrayEquals(expected,actual,0);
        Assert.assertEquals(expectedTimeWorked,actualTimeWorked,0);
    }
    @Test

    public void TestTeach0(){
        TestTeach(Educator.ALI,2.0);
    }

    @Test

    public void TestTeach1(){
        TestTeach(Educator.LEON,4.0);
    }

    @Test

    public void TestTeach2(){
        TestTeach(Educator.LENNY,11.0);
    }

    @Test
    public void TestLecture0(){
        TestLecture(Educator.LEON,4);
    }


    @Test
    public void TestLecture1(){
        TestLecture(Educator.ALI,7);
    }
}
