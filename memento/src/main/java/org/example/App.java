package org.example;

import org.example.menento.Git;
import org.example.menento.Project;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Git git = new Git();

        System.out.println("Creating the new project.");

        project.setVersion("Version 1.0");
        project.setInformation("Test value a = 0;");
        git.setSave(project.save());
        System.out.println(project);
        Thread.sleep(3000);

        project.setVersion("Version 1.1");
        project.setInformation("Test value a = 25;");
        git.setSave(project.save());
        System.out.println(project);
        Thread.sleep(3000);

        project.setVersion("Version 2.0");
        project.setInformation("New test value b = 32;");
        System.out.println(project);
        Thread.sleep(3000);

        project.load(git.getSave());
        System.out.println(project);
    }
}
