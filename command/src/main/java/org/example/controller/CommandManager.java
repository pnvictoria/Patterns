package org.example.controller;

import org.example.controller.command.ChangeMasterCommandImpl;
import org.example.controller.command.ChangeTeamCommandImpl;
import org.example.controller.command.ExitCommandImpl;
import org.example.controller.command.MasterTeamListCommandImpl;

import java.util.HashMap;

public class CommandManager {
    private int choice;
    public static final HashMap<Integer, Command> commands = new HashMap<>();

    public CommandManager() {
        commands.put(1,new ChangeMasterCommandImpl());
        commands.put(2,new ChangeTeamCommandImpl());
        commands.put(3,new MasterTeamListCommandImpl());
        commands.put(4,new ExitCommandImpl());
    }

    public void getCommand(int choice) {
        if(commands.get(choice) != null) {
            commands.get(choice).execute();
        } else {
            System.out.println("Error!");
        }
    }
}
