package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People <T extends Person> implements Iterable <T> {
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
    private List<T> personList=new ArrayList<T>();
    public void add(T person){
        this.personList.add(person);
    }

    public T findById(long id){

        for (T p:personList) {
             if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    public Boolean contains(T person){
        return this.personList.contains(person);
    }

    public void remove(T person){
        if(this.contains(person)){
            this.personList.remove(person);
        }
    }

    public int count(){
        return this.personList.size();
    }

    public void remove(long id){
        T person=findById(id);
        if(person!=null){
            this.personList.remove(person);
        }
    }

    public void removeAll(){
        this.personList.clear();
    }

    public abstract T[] toArray();


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int curent=0;
            @Override
            public boolean hasNext() {
                return curent<personList.size();
            }

            @Override
            public T next() {
                T next=personList.get(curent);
                curent++;
                return next;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
