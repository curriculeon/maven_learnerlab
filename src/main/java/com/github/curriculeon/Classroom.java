package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Classroom {

    People students = Students.getINSTANCE();
    People instructors = Instructors.getINSTANCE();

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        Person[] studentArray = new Student[students.count()];
        students.personList.toArray(studentArray);
        teacher.lecture((Learner[])studentArray, numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours) {
        Person instructor = instructors.findById(id);
        Person[] studentArray = new Student[students.count()];
        students.personList.toArray(studentArray);
        ((Teacher)instructor).lecture((Learner[])studentArray, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentMap = new HashMap<Student, Double>();
        Iterator cohortIterator = students.iterator();
        while(cohortIterator.hasNext()) {
            Student thisStudent = (Student)(cohortIterator.next());
            studentMap.put(thisStudent, thisStudent.getTotalStudyTime());
        }
        return studentMap;
    }
}
