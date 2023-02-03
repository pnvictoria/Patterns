package org.example.entety;

import org.example.patterns.strategy.PostStrategy;

public class EmployeeManager extends Employee implements PostStrategy {
    private final String POSITION = "Manager ";

    public EmployeeManager(String name, String surname) {
        super(name,surname);
    }

    @Override
    public boolean isPossibleNewPosition() {
        return true;
    }

    @Override
    public void collectPositionDetails() {
        System.out.println("Current position: " + POSITION);
    }
}
