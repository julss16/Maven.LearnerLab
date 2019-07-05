package io.zipcoder.interfaces;

public class Person {

    private Long id;
    private String name;


    public Person(){

        this(Long.MAX_VALUE, "");

    }
    public Person(Long id, String name) {
        this.id = id;
        this.name= name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
