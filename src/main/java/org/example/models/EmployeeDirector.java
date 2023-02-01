package org.example.models;

public class EmployeeDirector extends Employee {

    private static EmployeeDirector INSTANCE;

    private EmployeeDirector() {
        super();
    }

    public static EmployeeDirector getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new EmployeeDirector();
        }
        return INSTANCE;
    }
}
