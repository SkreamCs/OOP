package org.example.abdul.patterns.basepatterns.behavioral.chain;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();

        handler1.setSuccessor(handler2);

        Request request1 = new Request(RequestType.TYPE1);
        handler1.handleRequest(request1);

        Request request2 = new Request(RequestType.TYPE2);
        handler1.handleRequest(request2);
    }
}

