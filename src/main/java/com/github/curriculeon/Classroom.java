package com.github.curriculeon;
import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    INSTANCE;

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher instructor = instructors.findById(id);
        instructor.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new HashMap<>();
        for(Student student : students.toArray()) {
            Double studyTime = student.getTotalStudyTime();
            result.put(student, studyTime);
        }
        return result;
    }

}



