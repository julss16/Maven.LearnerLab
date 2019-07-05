package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{


    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {

        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, Double numberOfHours) {

        Double numberOfHoursPerLearner = numberOfHours/learners.length;

        for (Learner l : learners ){

            Double d=  l.getTotalStudyTime();
         d +=numberOfHoursPerLearner;

        }


    }
}
