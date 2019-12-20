package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People implements Iterable<Person> {
    /* The class should instantiate a `List` field of `Person` objects named `personList`.
            * The class should define a method named `add` which adds a `Person` to the `personList`.
            * The class should define a method named `findById` which makes use of a `long id` parameter to return a `Person` object with the respective `id` field.
	* The class should define a named `contains` which makes use of a `Person person` parameter to return `true` if the `personList` contains the respective `Person` object.
	* The class should define a method named `remove` which makes use of a `Person person` parameter to remove a respective `Person` object.
	* The class should define a method named `remove` which makes use of a `long id` parameter to remove a `Person` object with the respective `id` field.
	* The class should define a named `removeAll` which clears our `personList` field.
	* The class should define a method named `count` which returns the size of `personList`.
            * The class should define a method named `toArray` which returns an array representation of the `personList` field.
	* The class should implement `Iterable<E>` and define a method named `iterator` which makes use of the `personList` field to generate a new a `Iterator<E>`.
*/
    private List<Person> personList=new ArrayList<Person>();
    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id){

        for (Person p:personList) {
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    public Boolean contains(Person person){
        return this.personList.contains(person);
    }

    public void remove(Person person){
        if(this.contains(person)){
            this.personList.remove(person);
        }
    }

    public int count(){
        return this.personList.size();
    }

    public void remove(long id){
        Person person=findById(id);
        if(person!=null){
            this.personList.remove(person);
        }
    }

    public void removeAll(){
        this.personList.clear();
    }

    public  Person[] toArray(){

        return  this.personList.toArray(Person[]::new);

    }


    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person>() {

            int curent=0;
            @Override
            public boolean hasNext() {
                return curent<personList.size();
            }

            @Override
            public Person next() {
                Person next=personList.get(curent);
                curent++;
                return next;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Person> action) {

    }

    @Override
    public Spliterator<Person> spliterator() {
        return null;
    }
}
