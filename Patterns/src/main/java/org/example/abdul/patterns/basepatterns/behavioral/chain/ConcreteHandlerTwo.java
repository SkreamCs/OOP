package org.example.abdul.patterns.basepatterns.behavioral.chain;

public class ConcreteHandlerTwo extends Handler {
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println("Handled by ConcreteHandler2");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

