package org.example.abdul.patterns.basepatterns.structural.adapter.proxy;

public class ProjectRun {
    public static void main(String[] args) {
       Project project = new ProxyProject("/https://www.github.com/tumho00005/API");
       project.copy();
    }
}
