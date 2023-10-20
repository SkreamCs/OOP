package org.example.abdul.patterns.basepatterns.behavioral.chain.mediator;

interface Mediator {
    void send(String message, Colleague colleague);
}