package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator = Educator.Apollo;
        Assert.assertTrue(String.valueOf(educator instanceof Teacher), true);
    }
    @Test
    public void testTeach (){
        double numberOfHours = 5;
        Educator educator = Educator.Apollo;
        Learner learner = new Student(3,"Mike", 4);
        Double newNumberOfHours = learner.getTotalStudyTime()+numberOfHours;
        educator.teach(learner, numberOfHours);
        Assert.assertEquals(newNumberOfHours, learner.getTotalStudyTime());
    }
    @Test
    public void testLecture (){
        Educator educator = Educator.Apollo;
        Learner[] learner = new Learner[5];
        Double[] newStudentStudyTime = new Double[5];
        Double[] newTotalStudyTime = new Double[5];
        double numberOfHours = 20;
        for(int i=0; i<5; i++){
            learner[i] = new Student(2, "Lamp", 6);
            newStudentStudyTime[i] = learner[i].getTotalStudyTime() + (numberOfHours/learner.length);
        }
        educator.lecture(learner, numberOfHours);
        for(int i=0; i<5; i++) {
            newTotalStudyTime[i] = learner[i].getTotalStudyTime();
        }
        Assert.assertEquals(newStudentStudyTime, newTotalStudyTime);
    }
}
