package org.example.abdul.patterns.basepatterns.creational.abstractFactory.travel;

import org.example.abdul.patterns.basepatterns.creational.abstractFactory.DriveTeamFactory;
import org.example.abdul.patterns.basepatterns.creational.abstractFactory.PilotTransportTest;
import org.example.abdul.patterns.basepatterns.creational.abstractFactory.TransportToTravel;

public class TravelClient {
    public static void main(String[] args) {
        DriveTeamFactory travelTeamFactory = new TravelTeamFactory();
        TransportToTravel transport =  travelTeamFactory.getTransport();
        PilotTransportTest pilotTransportTest = travelTeamFactory.getPilotTest();
        if (pilotTransportTest.pilotTest()) {
            transport.driveTransport();
            System.out.println("Have a nice trip!");
        } else if (pilotTransportTest.pilotTest() == false) {
            System.out.println("The driver is not there");
        }

    }
}
