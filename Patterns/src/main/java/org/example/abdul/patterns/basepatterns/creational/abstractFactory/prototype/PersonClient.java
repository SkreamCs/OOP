package org.example.abdul.patterns.basepatterns.creational.abstractFactory.prototype;

import java.util.List;

public class PersonClient {
    public static void main(String[] args) {
        PeopleTeam peopleTeam = new PeopleTeam();
        peopleTeam.add(new Person(11, "Alex", "Debrune"));
        peopleTeam.add(new Person(17, "Alex", "Fox"));
        peopleTeam.add(new Person(27, "Mark", "Debrune"));
        for (Person person: peopleTeam.getPeople()) {
            System.out.println(person);
        }
        System.out.println("change after copying");
        List<Person> list = peopleTeam.copyPerson();
        list.add(new Person(60, "Derok", "Fox"));
        list.forEach(System.out::println);
    }
}
