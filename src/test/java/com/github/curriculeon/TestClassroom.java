package com.github.curriculeon;

// * Create a `Classroom` class.
//	* Create a `testHostLecture` method which ensures that each of the `Student`'s `totalStudyTime`
//	instance variable is incremented by the specified `numberOfHours` upon invoking the `hostLecture` method.

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClassroom {
    @Test
public void TestEducatorClassroom(){
    Classroom.getInstance().hostLecture(Educator.LEON,18);
    Double expectedNumberOfHours1=3.0;
    //then
    Classroom.getInstance().getStudyMap().forEach((st,t)->{Assert.assertEquals(expectedNumberOfHours1,t);});
        Classroom.getInstance().hostLecture(Educator.LEON,-18);
}
    @Test
    public void TestClassroom() {

        for (Instructor instr : Instructors.getInstance().toArray()) {
            Classroom.getInstance().hostLecture(instr,18.0);
        }
        Double expectedNumberOfHours1=9.0;
        Double expectedNumberOfHours2=18.0;
        //then
        Classroom.getInstance().getStudyMap().forEach((st,t)->{Assert.assertEquals(expectedNumberOfHours1,t);});

        for (Person instr : Instructors.getInstance().toArray()) {

        Classroom.getInstance().hostLecture(instr.getId(),18.0);
    }
        Classroom.getInstance().getStudyMap().forEach((st,t)->{Assert.assertEquals(expectedNumberOfHours2,t);});
    }


}
