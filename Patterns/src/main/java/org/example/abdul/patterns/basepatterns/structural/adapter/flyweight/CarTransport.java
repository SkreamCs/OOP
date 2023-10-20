package org.example.abdul.patterns.basepatterns.structural.adapter.flyweight;

public class CarTransport implements Transport{
    @Override
    public void drive() {
        System.out.println("car rides");
    }
}
