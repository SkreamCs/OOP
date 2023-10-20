package org.example.abdul.patterns.basepatterns.structural.adapter.facade;

public class Transport {
    public void driveTime(BugTracer tracer) {
       if(tracer.isActiveSprint()) {
           System.out.println("machine is active");
       } else {
           System.out.println("the car is being refueled");
       }
    }

}
