package org.example.abdul.patterns.basepatterns.creational.abstractFactory.singleton;

public class GameRun {
    public static void main(String[] args) {
        GameProgress gameProgress = GameProgress.commonGetSingle();
        System.out.println("launching the game");
        System.out.println("second level");
        gameProgress.addProgress("second level");
        System.out.println("end of the game");
    }
}
