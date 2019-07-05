package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {


    @Test
    public void testImplementation(){

        Learner student = (Learner) (Object)new Student(1L, "Ajulu");

        Assert.assertTrue(student instanceof Learner);
    }



    @Test
    public void testInheritance(){

        Person student = (Person)(Object) new Student(2L, "Michael");
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void learnTest() {


    }

    @Test
    public void getTotalStudyTimeTest() {
        Double numberOfHours= 20.0;
        Student student = new Student(1L, "James");
        student.learn(numberOfHours);


        Double expected= 20.0;
        Double actual= student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);

    }


}

