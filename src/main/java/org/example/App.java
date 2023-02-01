package org.example;

import org.example.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeDirector employeeDirector = new EmployeeDirector("Tom","Good");

        //Department #1
        List<Employee> employeesTeam1 = new ArrayList<Employee>();
        employeesTeam1.add(new Employee("Kate", "Bloom"));
        employeesTeam1.add(new Employee("Tomy", "Blood"));

        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("Task #1"));
        tasks.add(new Task("Task #2"));

        Project project1 = new Project("Main project", tasks);
        EmployeeManager employeeManager = new EmployeeManager("Bill", "Cooper");

        //Department #2
        List<Employee> employeesTeam2 = new ArrayList<Employee>();
        employeesTeam2.add(new Employee("Kate", "Bloom"));
        employeesTeam2.add(new Employee("Tomy", "Blood"));

        List<Task> tasks2 = new ArrayList<Task>();
        tasks.add(new Task("Task #1"));
        tasks.add(new Task("Task #2"));

        Project project2 = new Project("Main project", tasks2);
        EmployeeManager employeeManager2 = new EmployeeManager("Bill", "Cooper");

        //Departments all
        List<Department> departments = new ArrayList<Department>();
        departments.add(new Department(employeesTeam1, project1, employeeManager));
        departments.add(new Department(employeesTeam2, project2, employeeManager2));

        oper:
        while (true) {
            System.out.println("********************************");
            System.out.println(" 1. Show director information;");
            System.out.println(" 2. Show department list;");
            System.out.println(" 3. Print employees list;");
            System.out.println(" 4. Information about management;");
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
