package org.example.abdul.patterns.basepatterns.structural.adapter.decorator;

public class Travel extends TransportDecorator {
    public Travel(Transport transport) {
        super(transport);
    }
    String travelDrive() {
        return "the journey has begun";
    }
    @Override
    public String drive() {
       return super.drive() + travelDrive();
    }
}
