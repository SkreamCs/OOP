package org.example.abdul.patterns.basepatterns.structural.adapter.bridge;

public class TravelCountry extends Travel{
    public TravelCountry(Transport transport) {
        super(transport);
    }

    @Override
    void travelStart() {
        transport.flyToTransport();
        System.out.println("we're flying to the country");
    }
}
