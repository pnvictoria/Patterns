package org.example.contoller.comands;

import org.example.entety.EmployeeManager;
import org.example.patterns.command.Command;

import static org.example.CommandMenu.department;


public class ChangeDepartmentManagerImpl implements Command {
    @Override
    public void execute() {
        System.out.println("Old manager - " + department.getEmployeeManager());
        department.setEmployeeManager(new EmployeeManager("Victor","Toom"));
        System.out.println("New manager - " + department.getEmployeeManager());
    }
}

