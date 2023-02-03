package org.example.contoller;

import org.example.contoller.comands.ChangeDepartmentManagerImpl;
import org.example.contoller.comands.EmployeeListCommandImpl;
import org.example.contoller.comands.ExitCommandImpl;
import org.example.contoller.comands.SetNewProjectCommandImpl;
import org.example.patterns.command.Command;

import java.util.HashMap;

public class CommandManager {
    private int choice;
    public static final HashMap<Integer, Command> commands = new HashMap<>();

    public CommandManager() {
        commands.put(1,new ChangeDepartmentManagerImpl());
        commands.put(2,new SetNewProjectCommandImpl());
        commands.put(3,new EmployeeListCommandImpl());
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
