package org.example.abdul.patterns.basepatterns.creational.abstractFactory.travel;

import org.example.abdul.patterns.basepatterns.creational.abstractFactory.TransportToTravel;

public class CarTransport implements TransportToTravel {
    @Override
    public void driveTransport() {
        System.out.println("the car starts moving");
    }
}
