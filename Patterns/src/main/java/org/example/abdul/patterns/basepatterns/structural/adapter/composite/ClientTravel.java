package org.example.abdul.patterns.basepatterns.structural.adapter.composite;

public class ClientTravel {
    public static void main(String[] args) {
        TeamStartToTravel teamStartToTravel = new TeamStartToTravel();
        teamStartToTravel.addTransport(new CarTransport());
        teamStartToTravel.addTransport(new CarTransport());
        teamStartToTravel.drive();

    }
}
