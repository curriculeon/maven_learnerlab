package com.github.curriculeon;
/*
Part 7.1 - Create Students singleton
Note: The creation of this class will demonstrate an implementation of singleton design pattern.
Create a Students class. (Done)
The class should be an unextendable subclass of the People class. (Done with final)
The class should statically instantiate a final field named INSTANCE of type Students.
The class should define a private nullary constructor which populates the INSTANCE field with respective
Student representations of your colleagues.
Each student should have a relatively unique id field.
The class should define a getInstance method which returns the INSTANCE field.
Part 7.0 - Test Students singleton
Create a TestStudents class.
Create a test method which ensures that each of the students in your current cohort are in your Students singleton.

 */


import java.util.ArrayList;

public class Students extends People<Student> {
  //  ArrayList<Student> personList=new ArrayList<>();
    final static Students instance = new Students();
    String [] cohort = new String[]{"David","Chris","Marcus","Leon","Mondira","Deepti","Steve","Yuru","Monica","Akila","Julia","David","Alonzo","Rachid","Emmanuel","Lionel","Solomon","People who don't speak"};
   private Students(){
       super();

     for(Student student:peopleMaker(cohort)){
         this.add(student);
     }
   }
   public static Students getInstance(){
        return instance;
   }

   public ArrayList<Student> peopleMaker(String[] names){
      ArrayList<Student> stu =new ArrayList<>();
       for(int i =0;i<names.length;i++){
           stu.add(studentMaker(Long.valueOf(i+1), names[i]));
       }
       return stu;
   }

   public Student studentMaker(Long id,String name){
       Person student =new Student(id,name);

       return new Student(id,name);
   }
@Override
public Student[] toArray() {
        Student[] p = new Student[this.personList.size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = this.personList.get(i);
        }
        return p;
    }
    @Override
    public Student findByID(Long id) {
        for (Student student : instance.personList) {
            if (id == student.getId()) return  student;
        }
        return null;
    }
}
