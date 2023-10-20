package org.example.abdul.patterns.basepatterns.structural.adapter.bridge;

public class TravelClient {
    public static void main(String[] args) {
        Travel travels = new TravelCountry(new AirplaneTransport());
        travels.travelStart();

    }
}
