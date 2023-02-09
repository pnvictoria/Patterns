package org.example;

import org.example.contoller.CommandManager;
import org.example.entety.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandMenu {
    public static Department department;

    public static void main(String[] args) {
        List<Employee> employeesTeam1 = new ArrayList<>();
        Employee employee1 = new Employee("Kate", "Bloom");
        Employee employee2 = new Employee("Tomy", "Blood");
        employeesTeam1.add(employee1);
        employeesTeam1.add(employee2);

        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("Task #1"));
        tasks.add(new Task("Task #2"));

        Project project = new Project("Main project", tasks);
        EmployeeManager employeeManager = new EmployeeManager("Bill", "Cooper");

        department = new Department(employeesTeam1, project, employeeManager);

        while (true) {
            int choice;
            System.out.println("__________________________");
            System.out.println("Command menu:\n" +
                    "1 - Change manager of the department;\n" +
                    "2 - Set new project to the department;\n" +
                    "3 - List of workers;\n" +
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
