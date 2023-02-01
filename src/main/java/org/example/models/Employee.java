package org.example.models;

import org.example.models.observer.Observers;

public class Employee implements Observers {
    private String name;
    private String surname;

    public Employee () {
    }

    public Employee (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void notifies() {
        System.out.println(name + " " + surname + " aware of the changes.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

