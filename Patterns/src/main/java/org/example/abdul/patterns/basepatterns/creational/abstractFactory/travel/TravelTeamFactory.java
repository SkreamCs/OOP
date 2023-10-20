package org.example.abdul.patterns.basepatterns.creational.abstractFactory.travel;

import org.example.abdul.patterns.basepatterns.creational.abstractFactory.TransportToTravel;
import org.example.abdul.patterns.basepatterns.creational.abstractFactory.DriveTeamFactory;
import org.example.abdul.patterns.basepatterns.creational.abstractFactory.PilotTransportTest;

public class TravelTeamFactory implements DriveTeamFactory {

    @Override
    public TransportToTravel getTransport() {
        return new CarTransport();
    }

    @Override
    public PilotTransportTest getPilotTest() {
        return new PilotTransport();
    }
}
