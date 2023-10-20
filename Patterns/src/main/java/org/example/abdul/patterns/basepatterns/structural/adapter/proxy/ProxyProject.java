package org.example.abdul.patterns.basepatterns.structural.adapter.proxy;

public class ProxyProject implements Project{
    private JavaProject javaProject;
    private String url;

    public ProxyProject( String url) {
        this.url = url;
    }

    @Override
    public void copy() {
        if (javaProject == null) {
            javaProject = new JavaProject(url);
        }
        javaProject.copy();
    }
}
