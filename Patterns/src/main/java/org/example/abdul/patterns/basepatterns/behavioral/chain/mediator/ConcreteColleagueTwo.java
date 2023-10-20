package org.example.abdul.patterns.basepatterns.behavioral.chain.mediator;

class ConcreteColleagueTwo extends Colleague {
    public ConcreteColleagueTwo(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}

