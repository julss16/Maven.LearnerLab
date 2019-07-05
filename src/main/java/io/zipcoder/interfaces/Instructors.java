package io.zipcoder.interfaces;

public class Instructors extends  People<Instructor> {



    private static final Instructors ourInstance = new Instructors();


    public static Instructors getInstance() {
        return ourInstance;
    }

    private Instructors() {
        super.add(new Instructor(1234L, "Kris"));
        super.add(new Instructor(1235L, "Dolio"));
        super.add(new Instructor(1236L, "Froilan"));
        super.add(new Instructor(1237L, "Willhem"));

    }

    public Instructor[] toArray(){

        Instructor[] instructors= new Instructor[super.personList.size()];
        return super.personList.toArray(instructors);

    }

}
