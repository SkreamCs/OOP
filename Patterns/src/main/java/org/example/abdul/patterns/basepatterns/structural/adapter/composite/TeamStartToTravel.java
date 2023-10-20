package org.example.abdul.patterns.basepatterns.structural.adapter.composite;


import java.util.ArrayList;
import java.util.List;

public class TeamStartToTravel implements Transport {
    private List<Transport> transports = new ArrayList<>();
    void addTransport(Transport transport) {
        transports.add(transport);
    }
    @Override
    public void drive() {
        System.out.println("StartTravel");
        for (Transport transport : transports) {
            transport.drive();
        }
    }
}
