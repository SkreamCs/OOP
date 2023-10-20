package org.example.abdul.patterns.basepatterns.behavioral.chain.interpreter;

public class Client {
    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
                new AddExpression(new NumberExpression(10), new NumberExpression(5)),
                new NumberExpression(2));

        int result = expression.interpret();

        System.out.println("Result: " + result);
    }
}




