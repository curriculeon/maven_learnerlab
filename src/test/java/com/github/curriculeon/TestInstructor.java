package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;



public class TestInstructor {
 @Test
 public void testimplementation() {
  Instructor i = new Instructor();
  boolean a = i instanceof Teacher;
  //then
  Assert.assertTrue(a);
 }

 @Test
 public void testInheritance() {
  Instructor i = new Instructor();
  boolean a = i instanceof Person;
  //then
  Assert.assertTrue(a);
 }

 @Test
 public void testteach() {
  //given
  double expectedStudyTime = 4;
  double numberofHours = 4;
  double delta = 0;
  Instructor i = new Instructor();
  Student s = new Student();

  i.teach(s, numberofHours);
  double actualStudytime = s.getStudyTotalTime();

  //then
  Assert.assertEquals(expectedStudyTime, actualStudytime, delta);


 }

 /**public void testlecture() {
  double numberofHours = 5;

  Learner[] learners = new Learner[]{
          new Student(0L, "Leon"),
          new Student(1L, "Christopher"),
          new Student(2L, "Hunter"),
  };

  Instructor i = new Instructor();
  i.lecture(learners, numberofHours);
 } */
}

