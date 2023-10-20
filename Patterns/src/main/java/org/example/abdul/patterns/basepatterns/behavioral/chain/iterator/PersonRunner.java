package org.example.abdul.patterns.basepatterns.behavioral.chain.iterator;

public class PersonRunner {
    public static void main(String[] args) {
        String[] special =  { "doctor", "firefighter", "policeOfficer"};
        Person person = new Person(34, special);
        Iterator<String> iterator = person.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
