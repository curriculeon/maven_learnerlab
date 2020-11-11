package com.github.curriculeon;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AssociativeArrayTest {

    @Test
    public void arraysKeyValue() {
        String[] s = "The quick brown fox".split(" ");
        Integer key = 0;
        String value = s[key];
        System.out.println("Key = " + key);
        System.out.println("Value = " + value);
    }

    @Test
    public void mapKeyValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "The");
        map.put(1, "quick");
        map.put(2, "brown");
        map.put(3, "fox");

        Integer key = 0;
        String value = map.get(key);
        System.out.println("Key = " + key);
        System.out.println("Value = " + value);
    }

    @Test
    public void mapKeyValueWithPerson() {
        Map<Person, PhoneNumber> phoneBook = new HashMap<>();
        Person leon = Person.LEON;
        Person fred = Person.FRED;
        Person david = Person.DAVID;

        phoneBook.put(leon, new PhoneNumber("555-333-4422"));
        phoneBook.put(fred, new PhoneNumber("555-333-4421"));
        phoneBook.put(david, new PhoneNumber("555-333-4420"));


        Person key = Person.LEON;
        PhoneNumber value = phoneBook.get(key);
        System.out.println("Key = " + key);
        System.out.println("Value = " + value);
    }
}
