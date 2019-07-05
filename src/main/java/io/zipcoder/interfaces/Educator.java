package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    //KRIS(Instructors.getInstance(), ),
    DOLIO,
    WILLHEM,
    FROILAN;

    private Double timeWorked;

    public void teach(Learner learner, Double numberOfHours) {

    }

    public void lecture(Learner[] learners, Double numberOfHours) {

    }
}
