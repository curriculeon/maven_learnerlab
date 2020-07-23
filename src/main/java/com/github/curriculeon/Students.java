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

public final class Students extends People {
    final static Students instance = new Students();
    String [] cohort = new String[]{"David","Chris","Marcus","Leon","Mondira","Deepti","Steve","Yuru","Monica","Akila","Julia","David","Alonzo","Rachid","Emmanuel","Lionel","Solomon","People who don't speak"};
   private Students(){
       super();

     for(Person person:peopleMaker(cohort)){
         this.personList.add(person);
     }
   }

   public static Students getInstance(){
        return instance;
   }

   public ArrayList<Person> peopleMaker(String[] names){
       People people = new People();
       for(int i =0;i<names.length;i++){
           people.add(studentMaker(Long.valueOf(i+1), names[i]));
       }
       return people.personList;
   }

   public Person studentMaker(Long id,String name){
       Person student =new Student(id,name);

       return new Student(id,name);
   }
}
