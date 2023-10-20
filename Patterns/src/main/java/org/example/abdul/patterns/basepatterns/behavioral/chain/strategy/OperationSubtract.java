package org.example.abdul.patterns.basepatterns.behavioral.chain.strategy;

class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}


