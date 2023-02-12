package org.example.controller.command;

import org.example.controller.Command;

import static org.example.App.mainProject;

public class MasterTeamListCommandImpl implements Command {
    @Override
    public void execute() {
        for (int i = 0; i < mainProject.getTeam().size(); i++) {
            System.out.println(mainProject.getTeam().get(i));
        }
    }
}
