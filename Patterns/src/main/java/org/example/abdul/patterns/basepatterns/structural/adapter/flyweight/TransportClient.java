package org.example.abdul.patterns.basepatterns.structural.adapter.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TransportClient {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        List<Transport> transportList = new ArrayList<>();
        transportList.add(transportFactory.getTransport("car"));
        transportList.add(transportFactory.getTransport("car"));
        transportList.add(transportFactory.getTransport("car"));
        transportList.add(transportFactory.getTransport("car"));
        for (Transport transport:transportList) {
            transport.drive();
        }
    }
}
