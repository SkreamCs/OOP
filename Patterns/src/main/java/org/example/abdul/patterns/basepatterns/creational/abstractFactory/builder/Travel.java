package org.example.abdul.patterns.basepatterns.creational.abstractFactory.builder;

public class Travel {
    private String country;

    private int time;
    private TimeUnit unit;

    private int price;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time, TimeUnit unit) {
        this.time = time;
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setUnit(TimeUnit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "country='" + country + '\'' +
                ", time=" + time +
                ", unit=" + unit +
                ", price=" + price +
                '}';
    }
}
