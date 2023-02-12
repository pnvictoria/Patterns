package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private Worker master;
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

    public List<Worker> getTeam() {
        return team;
    }

    public void setTeam(List<Worker> team) {
        this.team = team;
    }

    public Worker getMaster() {
        return master;
    }

    public void setMaster(Worker master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", master=" + master +
                ", team=" + team +
                '}';
    }
}
