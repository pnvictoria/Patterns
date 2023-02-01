package org.example.models;

public class EmployeeManager extends EmployeeDirector {
    public EmployeeManager(String name, String surname) {
        super(name,surname);
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
