package org.example.controller.command;

import org.example.controller.Command;
import org.example.entity.Worker;

import static org.example.App.mainProject;

public class ChangeMasterCommandImpl implements Command {
    @Override
    public void execute() {
        System.out.println("Old master - " + mainProject.getMaster());
        mainProject.setMaster(new Worker("Victor","Tomber"));
        System.out.println("New master - " + mainProject.getMaster());
    }
}
