package org.example.abdul.patterns.basepatterns.behavioral.chain.iterator;

public class Person implements Collection<String>{
    private int age;

    private String[] professions;
    public Person(int age, String[] professions) {
        this.age = age;
        this.professions = professions;
    }
    @Override
    public Iterator<String> getIterator() {
        return  new IteratorPersonClass();
    }
    private class IteratorPersonClass implements Iterator<String> {
        int index;
        @Override
        public boolean hasNext() {
            if (index < professions.length) {
                return true;
            } else return false;
        }

        @Override
        public String next() {
            return professions[index++];
        }
    }
}
