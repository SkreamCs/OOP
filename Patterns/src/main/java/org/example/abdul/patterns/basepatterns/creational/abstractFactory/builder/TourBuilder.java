package org.example.abdul.patterns.basepatterns.creational.abstractFactory.builder;

public class TourBuilder {
    TravelBuilder travelBuilder;
    void setTravelBuilder(TravelBuilder travelBuilder) {
        this.travelBuilder = travelBuilder;
    }
    Travel buildTravel() {
        travelBuilder.createTravel();
        travelBuilder.buildCountry();
        travelBuilder.buildPrice();
        travelBuilder.buildTime();
        return travelBuilder.getTravel();
    }


}
