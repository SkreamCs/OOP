package org.example.abdul.patterns.basepatterns.structural.adapter.facade;

public class DriveWork {
    private Car car = new Car();
    private Transport transport = new Transport();
    private BugTracer bugTracer = new BugTracer();
    void runCheck() {
        car.drive();
        bugTracer.startSprint();
        transport.driveTime(bugTracer);
    }
}
