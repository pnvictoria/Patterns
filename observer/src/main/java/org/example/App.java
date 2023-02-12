package org.example;

import org.example.entity.Project;
import org.example.entity.Worker;

public class App {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom","Harden");
        Worker worker2 = new Worker("Victoria", "Cooker");
        Worker worker3 = new Worker("Ann", "Lison");
        Worker worker4 = new Worker("Lay", "Anderson");

        Project project = new Project("Lab5");
        project.addObserver(worker1);
        project.addObserver(worker2);
        project.addObserver(worker3);
        project.addObserver(worker4);

        project.setName("Lab5_new");
        System.out.println("Project name changed from Lab5 to Lab5_new.\n");
        project.notifiesObserver();
    }
}
