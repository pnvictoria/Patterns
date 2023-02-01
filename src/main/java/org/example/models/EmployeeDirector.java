package org.example.models;

public class EmployeeDirector extends Employee {
    public EmployeeDirector(String name, String surname) {
        super(name,surname);
    }

    @Override
    public String toString() {
        return "EmployeeDirector{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
