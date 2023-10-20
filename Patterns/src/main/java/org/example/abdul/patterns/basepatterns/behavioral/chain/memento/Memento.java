package org.example.abdul.patterns.basepatterns.behavioral.chain.memento;


class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

