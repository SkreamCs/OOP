package org.example.abdul.patterns.basepatterns.behavioral.chain.visitor;

class TitleVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book title: " + book.getTitle());
    }

    @Override
    public void visit(Movie movie) {
        System.out.println("Movie title: " + movie.getTitle());
    }
}


