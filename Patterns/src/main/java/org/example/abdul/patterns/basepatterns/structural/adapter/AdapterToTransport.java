package org.example.abdul.patterns.basepatterns.structural.adapter;

public class AdapterToTransport extends CarTransport implements Transport{
    @Override
    public void start() {
        driveCar();
    }

    @Override
    public void stop() {
        stopDrive();
    }

    @Override
    public void fuelTransport() {
        fillUpTransport();
    }
}
