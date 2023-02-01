package org.example.models;

import org.example.models.observer.Observers;
import org.example.models.observer.ProjectObserver;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectObserver {
    public List<Task> tasks;
    public String name;
    private List<Observers> list = new ArrayList<>();

    public Project(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Project(String name, List<Task> tasks) {
        this.tasks = tasks;
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addObserver(Observers observers) {
        list.add(observers);
    }

    public void removeObserver(Observers observers) {
        list.remove(observers);
    }

    public void notifiesObserver() {
        for (Observers observers : list) {
            observers.notifies();
        }
    }

}
