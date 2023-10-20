package org.example.abdul.patterns.basepatterns.behavioral.chain.interpreter;

public class SubtractExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}


