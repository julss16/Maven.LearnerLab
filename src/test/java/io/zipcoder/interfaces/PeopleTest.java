package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest {

    @Test
    public void addTest() {

        Person expected = new Person();
        People<Person> people = null;
        //when


        people.add(expected);
        Person actual = people.findById(Long.MAX_VALUE);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {

       // People people = new People();

        Person person = new Person(10L, "Ajulu");
        //people.personList.add(person);

        //people.add(person);

        Person expected= person;
        //Person actual= people.findById(Long.MAX_VALUE);
        //Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeTest() {

        Person expected = new Person();
        People<Person> people= null;

        people.add(expected);
        people.remove(expected);

        Assert.assertFalse(people.contains(expected));
    }
}

