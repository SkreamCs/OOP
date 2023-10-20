package org.example.abdul.patterns.basepatterns.behavioral.chain.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setState("State1");
        subject.setState("State2");
    }
}


