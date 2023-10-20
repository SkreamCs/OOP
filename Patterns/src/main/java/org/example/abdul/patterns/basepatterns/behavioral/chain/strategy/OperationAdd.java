package org.example.abdul.patterns.basepatterns.behavioral.chain.strategy;

class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

