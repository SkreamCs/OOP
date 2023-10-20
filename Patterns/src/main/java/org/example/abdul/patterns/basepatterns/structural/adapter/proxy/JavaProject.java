package org.example.abdul.patterns.basepatterns.structural.adapter.proxy;

public class JavaProject implements Project{
    private String url;

    public JavaProject(String url) {
        this.url = url;
        download();
    }

    void download() {
        System.out.println("Project download...");
    }
    @Override
    public void copy() {
        System.out.println("project copied");
    }
}
