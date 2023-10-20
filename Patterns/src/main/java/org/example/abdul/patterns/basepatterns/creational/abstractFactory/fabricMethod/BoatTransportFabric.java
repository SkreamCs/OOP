package org.example.abdul.patterns.basepatterns.creational.abstractFactory.fabricMethod;

public class BoatTransportFabric implements TransportFabric{
    @Override
    public Transport createTransport() {
        return new BoatTransport();
    }
}
