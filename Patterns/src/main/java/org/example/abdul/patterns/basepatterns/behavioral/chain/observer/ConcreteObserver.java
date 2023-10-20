package org.example.abdul.patterns.basepatterns.behavioral.chain.observer;


class ConcreteObserver implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("State changed: " + subject.getState());
    }
}

