package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public Double totalStudyTime;

    public Student(Long id, String name){
        super(id, name);
    }


    public void learn(Double numberOfHours) {

        totalStudyTime += numberOfHours;

    }

    public Double getTotalStudyTime() {

        return totalStudyTime;
    }
}
