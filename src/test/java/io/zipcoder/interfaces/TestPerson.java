package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testNullaryConstructor(){
        //given
        Person person = new Person();
        Long expectedId = Long.MAX_VALUE;
        String expectedName= "";

        //when
        Long actualId= person.getId();
        String actualName= person.getName();

        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);


    }

    @Test
    public void setName() {
        //given
        Person person = new Person();
        String expected = "Ajulu";

        //when
        person.setName(expected);
        String actual= person.getName();

        //then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getId() {
        Person person= new Person(3L, "James");
        Long expected= 3L;

        Assert.assertEquals(expected, person.getId());
    }



    @Test
    public void getName() {
        Person person = new Person(4L, "Amy");
        String expected= "Amy";

        Assert.assertEquals(expected, person.getName());


    }
}
