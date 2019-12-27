package com.github.curriculeon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class People implements Iterable {

    private List<Person> personList = new LinkedList<>();

    public People(){}

    public People(List list)
    {
        personList = list;
    }

    public void add (Person person)
    {
        personList.add(person);
    }

    public Person findById (long id)
    {
        Person result = null;
        for (Person person: personList) {
            if (person.getId() == id) {
                result = person;
                break;
            }
        }
        return result;
    }

    public Boolean contains (Person person)
    {
        return personList.contains(person);
    }

    public void remove (Person person)
    {
        personList.remove(person);
    }

    public void removeById (long id)
    {
        personList.remove(findById(id));
    }

    public void removeAll ()
    {
        personList.clear();
    }

    public int count()
    {
        return personList.size();
    }

    public Person[] toArray()
    {
        return (Person[]) personList.toArray();
    }
    @Override
    public Iterator iterator() {
        Iterator iterator = personList.iterator();
        return iterator;
    }
}
