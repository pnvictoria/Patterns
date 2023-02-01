package org.example.models;

import java.util.List;

public class Project {
    public List<Task> tasks;
    public String name;

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
}
