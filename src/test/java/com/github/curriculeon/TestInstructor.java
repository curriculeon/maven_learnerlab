package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(String.valueOf(instructor instanceof Teacher), true);
    }
    public void testInheritance(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(String.valueOf(instructor instanceof Person), true);
    }
    @Test
    public void testTeach (){
        Instructor instructor = new Instructor();
        Learner learner = new Student();
        double numberOfHours = 5;
        Double newNumberOfHours = learner.getTotalStudyTime()+numberOfHours;
        instructor.teach(learner, numberOfHours);
        Assert.assertEquals(newNumberOfHours, learner.getTotalStudyTime());
    }
    @Test
    public void testLecture (){
        Instructor instructor = new Instructor();
        Learner[] learner = new Learner[5];
        Double[] newStudentStudyTime = new Double[5];
        Double[] newTotalStudyTime = new Double[5];
        double numberOfHours = 20;
        for(int i=0; i<5; i++){
          learner[i] = new Student();
          newStudentStudyTime[i] = learner[i].getTotalStudyTime() + (numberOfHours/learner.length);
        }
        instructor.lecture(learner, numberOfHours);
        for(int i=0; i<5; i++) {
            newTotalStudyTime[i] = learner[i].getTotalStudyTime();
        }
        Assert.assertEquals(newStudentStudyTime, newTotalStudyTime);
    }
}
