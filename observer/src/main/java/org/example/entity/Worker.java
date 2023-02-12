package org.example.entity;

import org.example.interfaces.Observers;

public class Worker implements Observers {
    private String name;
    private String surname;
    private int age;

    public Worker() {
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Worker(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void notifies() {
        System.out.println(name + " " + surname + " aware of the changes.");
    }
}