package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<S extends Person> implements Iterable{

    public List<Person> personList;
    public Iterator<Person> iterator;


    public People(List<Person> personList) {
        this.personList= personList;

    }

    public People() {

        personList= new ArrayList<Person>();

    }


    public void add(Person person) {

        personList.add(person);
    }

    public Person findById(Long id) {

        for (Person p : personList) {
            if (p.getId().equals(id)) {

                return p;
            }

        }return null;
    }

        public boolean contains (Person person){

            return personList.contains(person);
        }

        public void remove (Person person){

            personList.remove(person);
        }

        public void removeAll () {

            personList.removeAll(personList);
        }

        public Integer count() {

            return personList.size();
        }

        abstract S[] toArray();

        public Iterator<Person> iterator () {

            iterator = (Iterator<Person>) personList;

            return iterator;
        }

    }
