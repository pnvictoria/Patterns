package org.example.controller.command;

import org.example.controller.Command;
import org.example.entity.Worker;

import java.util.ArrayList;
import java.util.List;

import static org.example.App.mainProject;

public class ChangeTeamCommandImpl implements Command {
    @Override
    public void execute() {
        List<Worker> newTeam = new ArrayList<>();
        newTeam.add(new Worker("Tim","Harden"));
        newTeam.add(new Worker("Victoria", "Cooker"));
        mainProject.setTeam(newTeam);

        System.out.println("New team:");
        for (int i = 0; i < mainProject.getTeam().size(); i++) {
            System.out.println(mainProject.getTeam().get(i));
        }
    }
}
