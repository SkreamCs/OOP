package org.example.abdul.patterns.basepatterns.structural.adapter.decorator;

public class CarTransport implements Transport{
    @Override
    public String drive() {
        return "the car starts moving";
    }
}
