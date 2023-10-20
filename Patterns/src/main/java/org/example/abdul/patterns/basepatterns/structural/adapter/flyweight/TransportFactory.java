package org.example.abdul.patterns.basepatterns.structural.adapter.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TransportFactory {
    private static final Map<String, Transport> transports = new HashMap<>();
    public Transport getTransport(String model) {
        String modelNew = model.toLowerCase();
        Transport transport =  transports.get(model);
        if (transport == null) {
            switch (modelNew) {
                case "car": {
                    System.out.println("creating a car");
                    transport = new CarTransport();
                }
            }
        }
        transports.put(model, transport);
        return transport;
    }
}
