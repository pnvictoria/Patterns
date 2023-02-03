package org.example.contoller.comands;

import org.example.entety.Employee;
import org.example.patterns.command.Command;

import static org.example.CommandMenu.department;

public class EmployeeListCommandImpl implements Command {
    @Override
    public void execute() {
        for (Employee employee : department.getEmployees()) {
            System.out.println(employee);
        }
    }
}
