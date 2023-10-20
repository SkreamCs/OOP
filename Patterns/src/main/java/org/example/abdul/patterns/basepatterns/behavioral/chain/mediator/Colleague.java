package org.example.abdul.patterns.basepatterns.behavioral.chain.mediator;


abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void notify(String message);
}

