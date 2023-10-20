package org.example.abdul.patterns.basepatterns.behavioral.chain.visitor;

public class Client {
    public static void main(String[] args) {
        Media[] mediaItems = {new Book("Harry Potter"), new Movie("The Godfather"), new Book("To Kill a Mockingbird")};
        Visitor titleVisitor = new TitleVisitor();

        for (Media media : mediaItems) {
            media.accept(titleVisitor);
        }
    }
}

