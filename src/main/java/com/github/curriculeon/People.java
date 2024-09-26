package com.github.curriculeon;

import java.util.*;
import java.util.function.Consumer;

public abstract class People<P extends Person> implements Iterable<P>{
    
    //Attributes
    private final List<P> personList = new ArrayList<>();
    
    //Start Constructors
    
    //End Constructors
    
    //Start Methods
    public void add(P person){
        personList.add(person);
    }
    
    public Optional<P> findById(long id){
        return personList.stream().filter(person -> Objects.equals(id, person.getId())).findFirst();
    }
    
    public boolean contains(P person){
        return personList.contains(person);
    }
    
    public boolean remove(long id){
        return personList.removeIf(person -> Objects.equals(id, person.getId()));
    }
    
    public void removeAll(){
        personList.clear();
    }
    
    public int count() {
        return personList.size();
    }
    
    public P[] toArray(P[] array){
        return personList.toArray(array);
    }
    
    public abstract P[] toArray();
    
    @Override
    public Iterator<P> iterator() {
        return personList.iterator();
    }
    
    @Override
    public void forEach(Consumer<? super P> action) {
        personList.forEach(action);
    }
    
    @Override
    public Spliterator<P> spliterator() {
        return personList.spliterator();
    }
    //End Methods
}
