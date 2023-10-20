package org.example.abdul.patterns.basepatterns.behavioral.chain.mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueOne colleague1 = new ConcreteColleagueOne(mediator);
        ConcreteColleagueTwo colleague2 = new ConcreteColleagueTwo(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello, colleague2");
        colleague2.send("Hi, colleague1");
    }
}


