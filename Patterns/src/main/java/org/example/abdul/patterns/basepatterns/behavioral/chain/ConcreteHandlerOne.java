package org.example.abdul.patterns.basepatterns.behavioral.chain;

public class ConcreteHandlerOne extends Handler {
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println("Handled by ConcreteHandler1");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

