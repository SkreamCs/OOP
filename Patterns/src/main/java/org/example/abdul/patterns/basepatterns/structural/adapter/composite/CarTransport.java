package org.example.abdul.patterns.basepatterns.structural.adapter.composite;

public class CarTransport implements Transport{
    @Override
    public void drive() {
        System.out.println("the car starts moving");
    }
}
