package io.zipcoder.interfaces;

import java.util.List;

public  class Students extends People<Student> {

    private static Students Instance = new Students();

    public Students(List<Person> personList) {
        super(personList);
    }

    public static Students getInstance() {

        if (Instance == null) {
            Instance = new Students();
        }
        return Instance;
    }

    private Students() {
        super.add(new Student(5L, "Joe"));
        super.add(new Student(1L, "Alicia"));
        super.add(new Student(2L, "Sputnika"));
        super.add(new Student(3L, "Ashna"));
        super.add(new Student(4L, "Abram"));
        super.add(new Student(6L, "Erick"));
        super.add(new Student(7L, "Angelica"));

    }

    public Student[] toArray() {
        Student[] students= new Student[personList.size()];

        return personList.toArray(students);
    }

}

//Instance is final field , type is Students