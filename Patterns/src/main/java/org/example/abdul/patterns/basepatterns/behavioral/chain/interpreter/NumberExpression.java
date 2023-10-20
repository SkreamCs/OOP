package org.example.abdul.patterns.basepatterns.behavioral.chain.interpreter;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
