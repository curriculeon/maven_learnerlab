package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent
{
    @Test
    public void testimplementation()
    {
        Student s = new Student();

        Boolean a= s instanceof Learner;

        //then
        Assert.assertTrue(a);
    }

    @Test
    public void testinheritance()
    {
        Student s = new Student();

        Boolean a= s instanceof Person;
        
        //then
        Assert.assertTrue(a);

    }

    @Test
    public void testlearn()
    {
         //given
         double expectedStudyTime = 4;
         double numberofHours =4;
         double delta =0;

         //when
         Student st = new Student();
         st.learn(numberofHours);
         double actualStudytime = st.getStudyTotalTime();

          //then
          Assert.assertEquals(expectedStudyTime, actualStudytime,delta);
    }
}
