package org.example.abdul.patterns.basepatterns.behavioral.chain;

public abstract class Handler {
        protected Handler successor;

        public void setSuccessor(Handler successor) {
            this.successor = successor;
        }
        public abstract void handleRequest(Request request);
}
