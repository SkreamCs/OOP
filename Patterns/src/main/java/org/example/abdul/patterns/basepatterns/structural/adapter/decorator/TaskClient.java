package org.example.abdul.patterns.basepatterns.structural.adapter.decorator;

public class TaskClient {
    public static void main(String[] args) {
        Transport transport = new Travel(new CarTransport());
        System.out.println(transport.drive());
    }
}
