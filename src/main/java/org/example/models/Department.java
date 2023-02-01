package org.example.models;

import java.util.List;

public class Department {
    public List<Employee> employees;
    public Project project;
    public EmployeeManager employeeManager;

    public Department(List<Employee> employees, Project project, EmployeeManager employeeManager) {
        this.employees = employees;
        this.project = project;
        this.employeeManager = employeeManager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employees=" + employees +
                ", project=" + project +
                ", employeeManager=" + employeeManager +
                '}';
    }
}
