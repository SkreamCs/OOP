package org.example.abdul.patterns.basepatterns.creational.abstractFactory.builder;

public class TravelStartBuilder extends TravelBuilder {
    @Override
    void buildCountry() {
       travel.setCountry("England");
    }

    @Override
    void buildPrice() {
      travel.setPrice(100000);
    }

    @Override
    void buildTime() {
      travel.setTime(10, TimeUnit.DAYS);
    }
}
