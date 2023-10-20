package org.example.abdul.patterns.basepatterns.behavioral.chain.memento;


import java.util.ArrayList;
import java.util.List;

class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
