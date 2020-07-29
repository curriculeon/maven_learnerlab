package com.github.curriculeon;
/*
Create a Classroom singleton.
The class should declare a field that references the instance of Students called students. DONE
The class should declare a field that references the instance of Instructors called instructors. Done
The class should define a method hostLecture which makes use of a Teacher teacher,
 double numberOfHours parameter to host a lecture to the composite personList field in the students reference.Done
The class should define a method hostLecture which makes use of a long id,
 double numberOfHours parameter to identify a respective Instructor to host a lecture to the composite personList field
                                                                           in the cohort reference. Done
The class should define a method getStudyMap which returns a new instance of a mapping from Student objects to
 Double objects, representative of each respective student's totalStudyTime.

 */

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Classroom {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours) {
        instructors.findByID(id).lecture(students.toArray(), numberOfHours);
    }

    public Map<Long, Double> getStudyMap() {
        Map<Long, Double> map = new TreeMap<>();
        ArrayList<Student> slist = students.personList;
        for (Student stu : slist) {
           map.put(stu.getId(),stu.getTotalStudyTime());
        }
        return map;
    }

}

