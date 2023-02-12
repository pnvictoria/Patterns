package org.example;

import org.example.controller.CommandManager;
import org.example.entity.Project;
import org.example.entity.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Project mainProject;

    public static void main(String[] args) {
        while (true) {
            int choice;
            mainProject = new Project("VictoryGame");
            List<Worker> newTeam = new ArrayList<>();
            newTeam.add(new Worker("Victoria", "Cooker"));
            newTeam.add(new Worker("Lay", "Anderson"));
            newTeam.add(new Worker("Ann", "Lison"));
            mainProject.setTeam(newTeam);

            System.out.println("__________________________");
            System.out.println("Command menu:\n" +
                    "1 - Change master of the team;\n" +
                    "2 - New team of the project;\n" +
                    "3 - List of master team;\n" +
                    "4 - Exit;");
            System.out.print("Choose:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("__________________________");

            CommandManager commandManager = new CommandManager();
            commandManager.getCommand(choice);
        }
    }
}
