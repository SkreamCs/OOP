package org.example.abdul.patterns.basepatterns.creational.abstractFactory.fabricMethod;

public class TransportClient {
    public static void main(String[] args) {
      TransportFabric transportFabric = createByTypeTransport("car");
      Transport transport = transportFabric.createTransport();
      transport.drive();


    }

    private static TransportFabric createByTypeTransport(String type) {
        if (type.equalsIgnoreCase("car")) return new CarTransportFabric();
        else if (type.equalsIgnoreCase("boat")) return new BoatTransportFabric();
        else {
           throw new RuntimeException("there is no such type");
        }
    }
}
