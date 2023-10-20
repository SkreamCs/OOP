package org.example.abdul.patterns.basepatterns.behavioral.chain.visitor;


class Movie implements Media {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

