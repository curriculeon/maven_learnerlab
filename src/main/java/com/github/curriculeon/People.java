package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
The class should instantiate a List field of Person objects named personList.
The class should define a method named add which adds a Person to the personList.
The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
The class should define a named contains which makes use of a Person person parameter
 to return true if the personList contains the respective Person object.
The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
The class should define a named removeAll which clears our personList field.
The class should define a method named count which returns the size of personList.
The class should define a method named toArray which returns an array representation of the personList field.
The class should implement Iterable<E> and define a method named iterator which makes use of the personList field to generate a new a Iterator<E>.
 */
abstract public class People <SomePerson extends Person>  implements Iterable<SomePerson> {
    ArrayList<SomePerson> personList =new ArrayList();

    public People() {

    }


    public void add(SomePerson person) {
        this.personList.add(person);
    }

    People(ArrayList people){
        this.personList=people;
    }

 public SomePerson findByID(Long id) {
     for (SomePerson person : this.personList) {
         if (id == person.getId()) return person;
     }
     return null;
 }


    public Boolean removePerson(SomePerson person) {
        return personList.remove(person);

    }

    public Boolean removePerson(Long id) {
        for (Person p : this.personList) {
            if (id.equals(p)) this.personList.remove(p);
            return true;
        }
        return false;

    }

    public void removeAll() {
        for (SomePerson p : this.personList) this.personList.remove(p);
    }

    public Integer sizeList() {
        return this.personList.size();
    }

  /*  public SomePerson[] toArr() {
        SomePerson[] p = new SomePerson[this.personList.size() - 1];
        for (int i = 0; i < p.length; i++) {
            p[i] = this.personList.get(i + 1);
        }
        return p;
    }
*/
    @Override
    public Iterator<SomePerson> iterator() {
        return personList.iterator();
    }

    abstract public SomePerson[] toArray();
}
