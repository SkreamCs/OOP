package org.example.abdul.patterns.basepatterns.structural.adapter;

public class DriveStart {
    public static void main(String[] args) {
        Transport transport = new AdapterToTransport();
        transport.start();
        transport.stop();
        transport.fuelTransport();
    }
}
