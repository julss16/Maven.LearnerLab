package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {

    @Test
    public void teachTest() {
    }

    @Test
    public void lectureTest() {
    }

    @Test
    public void testImplementation(){

        Teacher instructor = (Teacher)(Object) new Instructor(6L, "Kris");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){

        Person instructor = (Person)(Object) new Instructor(7L, "Will");
        Assert.assertTrue(instructor instanceof Person);

    }
}