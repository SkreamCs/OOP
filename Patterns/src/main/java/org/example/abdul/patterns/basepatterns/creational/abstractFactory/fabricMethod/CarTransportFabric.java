package org.example.abdul.patterns.basepatterns.creational.abstractFactory.fabricMethod;

public class CarTransportFabric implements TransportFabric{
    @Override
    public Transport createTransport() {
        return new CarTransport();
    }
}
