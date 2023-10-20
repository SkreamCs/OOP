package org.example.abdul.patterns.basepatterns.creational.abstractFactory.builder;

public class TravelClientStart {
    public static void main(String[] args) {
        TourBuilder tourBuilder = new TourBuilder();
        tourBuilder.setTravelBuilder(new TravelStartBuilder());
        Travel travel = tourBuilder.buildTravel();
        System.out.println(travel.toString());

    }
}
