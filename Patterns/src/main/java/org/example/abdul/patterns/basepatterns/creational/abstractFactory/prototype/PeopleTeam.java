package org.example.abdul.patterns.basepatterns.creational.abstractFactory.prototype;

import java.util.ArrayList;
import java.util.List;

public class PeopleTeam {
    private List<Person> people;
    List<Person> copyPerson() {
        List<Person> list = new ArrayList<>();
        for (Person person : people) {
           list.add(person.copyObject());
        }
        return list;
    }
    void add(Person person) {
        if (people == null) {
            people = new ArrayList<>();
        }
        people.add(person);
    }
    public List<Person> getPeople() {
        return people;
    }
    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
