package org.example.abdul.patterns.basepatterns.creational.abstractFactory.builder;

public abstract class TravelBuilder {
    Travel travel;

    public Travel getTravel() {
        return travel;
    }

    void createTravel() {
        travel = new Travel();
    }
    abstract void buildCountry();
    abstract void buildPrice();
    abstract void buildTime();
}
