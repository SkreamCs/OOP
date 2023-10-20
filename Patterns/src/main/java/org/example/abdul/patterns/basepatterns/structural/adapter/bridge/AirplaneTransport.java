package org.example.abdul.patterns.basepatterns.structural.adapter.bridge;

public class AirplaneTransport implements Transport {
    @Override
    public void flyToTransport() {
        System.out.println("the plane starts to take off");
    }
}
