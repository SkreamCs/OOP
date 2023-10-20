package org.example.abdul.patterns.basepatterns.creational.abstractFactory.singleton;

public class GameProgress {
    private static GameProgress gameProgress;
    private static String progress;
    public static synchronized GameProgress commonGetSingle() {
        if (gameProgress != null) {
            return gameProgress;
        } else {
            return new GameProgress();
        }
    }
    private GameProgress() {

    }
    public void addProgress(String progress) {
        this.progress += progress + "\n";
    }
    public String getProgress() {
        return progress;
    }
}
