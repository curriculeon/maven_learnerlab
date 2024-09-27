package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    private void testLearn(Double expected) {

        // When
       Student student = new Student(1234, "John Doe");
       student.learn(expected);

        // Then
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testInheritance() {
        // given
        Student student = new Student(1234, "");

        // when
        Boolean outcome = student instanceof Person;

        // then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testImplementation() {
        //given
        Student student = new Student(0,"");
        //when
        boolean outcome = student instanceof Learner;
        //then
        Assert.assertTrue(outcome);
    }

    @Test
    public void test0(){
        testLearn((double) 5);
    }
    @Test
    public void test1(){
        testLearn((double) 6);
    }
    @Test
    public void test2(){
        testLearn((double) 0);
    }

}
