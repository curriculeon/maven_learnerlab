package com.github.curriculeon;

public class Person {
    final long id1=0L;
    String name1="something";

    public Person(){};

    public Person(long id, String name )
    {
        name1=name;
    }

    public Person(String name1) {
        this.name1 = name1;
    }

    public long getid()
    {
         return(id1);
    }
    public String getname()
    {
        return(name1);
    }
    public void setname(String name)
    {
        name1=name;
    }

}
