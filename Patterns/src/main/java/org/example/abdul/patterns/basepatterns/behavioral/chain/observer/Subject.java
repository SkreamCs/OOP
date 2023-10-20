package org.example.abdul.patterns.basepatterns.behavioral.chain.observer;


interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}


