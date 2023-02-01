package org.example.models;

import org.example.models.strategy.PostStrategy;

public class EmployeeDirector extends Employee implements PostStrategy {
    private static EmployeeDirector INSTANCE;
    private final String POSITION = "Director";

    private EmployeeDirector() {
        super();
    }

    public static EmployeeDirector getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new EmployeeDirector();
        }
        return INSTANCE;
    }

    @Override
    public boolean isPossibleNewPosition() {
        return false;
    }

    @Override
    public void collectPositionDetails() {
        System.out.println("Current position: " + POSITION);
    }
}
