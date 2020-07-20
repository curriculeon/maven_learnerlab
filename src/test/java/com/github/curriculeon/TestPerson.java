package com.github.curriculeon;

public class TestPerson {
    private void testConstructor(long expectedId, String expectedName) {
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName());

    }

    private void testSetName() {
        Person person = new Person(id:null, name: null);
        String expected Name = "Some name";

        person.setName(expectedName);
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName());

    }
}
