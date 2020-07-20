package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.Person;
public class TestPerson {

    private void test(String expected) {

        // When
        Person person = new Person(1234567,expected);

        // Then
        String actual = person.getName();
        long actualId = person.getId();
        Assert.assertEquals(1234567, actualId);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test0() {
        test(null);
    }
    @Test
    public void test1() {
        test("John Charles Cutler");
    }
    @Test
    public void test2() {
        test("John Africa Vincent Leaphart");
    }

    @Test
    public void test3() {
        test("Tuskegee & Guatemala");
    }

    @Test
    public void test4() {
        test("What is morality?");
    }

}
