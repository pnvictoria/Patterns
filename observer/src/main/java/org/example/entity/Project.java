package org.example.entity;

import org.example.interfaces.Observers;
import org.example.interfaces.ProjectObserver;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectObserver {
    private String name;
    private List<Observers> list = new ArrayList<>();
    private List<Worker> team = new ArrayList<>();

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Observers> getList() {
        return list;
    }

    public void setList(List<Observers> list) {
        this.list = list;
    }

    public List<Worker> getTeam() {
        return team;
    }

    public void setTeam(List<Worker> team) {
        this.team = team;
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
