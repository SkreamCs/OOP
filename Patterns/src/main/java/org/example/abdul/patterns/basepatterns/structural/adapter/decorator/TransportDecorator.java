package org.example.abdul.patterns.basepatterns.structural.adapter.decorator;

public class TransportDecorator implements Transport {
    Transport transport;
    public TransportDecorator(Transport transport) {
        this.transport = transport;
    }
    @Override
    public String drive() {
       return transport.drive();
    }
}
