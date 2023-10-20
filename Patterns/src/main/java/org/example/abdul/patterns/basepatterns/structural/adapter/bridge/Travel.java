package org.example.abdul.patterns.basepatterns.structural.adapter.bridge;

public abstract class Travel {
    protected Transport transport;


    public Travel(Transport transport) {
        this.transport = transport;
    }
    abstract void travelStart();
}
