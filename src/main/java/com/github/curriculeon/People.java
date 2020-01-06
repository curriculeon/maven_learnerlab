package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {
      List<Person> personList = new ArrayList<>();
      public void add (Person person){
         this.personList.add(person);
      }
      public Person findById(long id){
          Person returnedObj = null;
          for(Person i: this.personList){
              if(i.id == id){
                  returnedObj = i;
                  break;
              }
          }
          return returnedObj;
      }
    public boolean contains(Person person){
        boolean checkContainValue = false;
        for(Person i: this.personList){
            if(i.name == person.name){
                checkContainValue = true;
                break;
            }
        }
        return checkContainValue;
      }
    public void remove(Person person) {
        for (Person i : this.personList) {
            if (i == person) {
                this.personList.remove(person);
                break;
            }
        }
    }
        public void remove(long id){
            for(Person i: this.personList){
                if(i.id == id){
                    this.personList.remove(i);
                    break;
                }
            }
    }
    public void removeAll(){
          this.personList.clear();
    }
    public int count(){
          return this.personList.size();
    }
    public Array[] toArray(){
     return this.personList.toArray(new Array[personList.size()]);
    }
    public Iterator<Person> iterator(){
          return this.personList.iterator();
    }
}
