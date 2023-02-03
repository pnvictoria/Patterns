package org.example;

import org.example.entety.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeDirector employeeDirector = EmployeeDirector.getInstance();
        employeeDirector.setName("Tom");
        employeeDirector.setSurname("Good");

        //Department #1
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

        project.addObserver(employee1);
        project.addObserver(employee2);

        //Departments all
        List<Department> departments = new ArrayList<Department>();
        departments.add(new Department(employeesTeam1, project, employeeManager));

        oper:
        while (true) {
            System.out.println("********************************");
            System.out.println(" 1. Show director information;");
            System.out.println(" 2. Show department list;");
            System.out.println(" 3. Print employees list;");
            System.out.println(" 4. Information about management;");
            System.out.println(" 5. Check strategy;");
            System.out.println(" 6. Check observer;");
            System.out.println(" 0. Exit;");
            System.out.print("Answer: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println(employeeDirector);
                    continue oper;
                case 2:
                    for (Department department:departments) {
                        System.out.println(department);
                    }
                    continue oper;
                case 3:
                    for (Department department:departments) {
                        for (Employee employee:department.getEmployees()) {
                            System.out.println(employee);
                        }
                    }
                    continue oper;
                case 4:
                    for (Department department:departments) {
                        System.out.println(department.getEmployeeManager());
                    }
                    continue oper;
                case 5:
                    employeeDirector.collectPositionDetails();
                    for (Department department:departments) {
                        department.getEmployeeManager().collectPositionDetails();
                        for (Employee employee:department.getEmployees()) {
                            employee.collectPositionDetails();
                        }
                    }
                    continue oper;
                case 6:
                    project.setName("Lab5 Main project");
                    System.out.println("Project name changed from Main project to Lab5 Main project.\n");
                    project.notifiesObserver();
                    continue oper;
                case 0:
                    System.out.println("The program was closed.");
                    System.exit(0);
                    continue oper;
                default:
                    continue oper;
            }
        }
    }
}
