package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
        Educator educator = Educator.LEON;

        boolean isTeacher = educator instanceof Teacher;

        Assert.assertTrue(isTeacher);
    }

    @Test
    public void testTeach(){
        Educator educator = Educator.LEON;
        Student student = new Student(null, null);
        double preStudyTime = student.getTotalStudyTime();
        double preWorkTime = educator.getTimeWorked();
        double lectureTime = 10.0;
        double expectedStudyTime = preStudyTime + lectureTime;
        double expectedWorkTime = preWorkTime + lectureTime;

        educator.teach(student, lectureTime);
        double actualStudyTime = student.getTotalStudyTime();
        double actualWorkTime = educator.getTimeWorked();

        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
        Assert.assertEquals(expectedWorkTime, actualWorkTime, 0.001);

    }

    @Test
    public void testLecture(){
        /*Student student1 = new Student(null, null);
        Student student2 = new Student(null, null);
        Student student3 = new Student(null, null);
        Student student4 = new Student(null, null);
        Student[] students = new Student[]{student1, student2, student3, student4};*/
        //SEE ALSO: Implementation in TestInstructor
        Student[] students = Students.getInstance().toArray();
        Educator educator = Educator.HUNTER;
        double lectureTime = students.length;
        double preWorkTime = educator.getTimeWorked();
        double expectedStudyTime = lectureTime/ students.length;
        double expectedWorkTime = preWorkTime + lectureTime;
        for(Student student : students){
            Assert.assertNotEquals(expectedStudyTime, student.getTotalStudyTime());
        }

        educator.lecture(students, lectureTime);
        double actualWorkTime = educator.getTimeWorked();
        for(Student student : students) {
            double actualStudyTime = student.getTotalStudyTime();

            //then
            Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
        }

        Assert.assertEquals(expectedWorkTime, actualWorkTime, 0.001);
    }
}
