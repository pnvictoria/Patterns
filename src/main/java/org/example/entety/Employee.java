package org.example.entety;

import org.example.patterns.observer.Observers;
import org.example.patterns.strategy.PostStrategy;

public class Employee extends Human implements PostStrategy, Observers {
    private final String POSITION = "Worker";

    public Employee () {
        super();
    }

    public Employee (String name, String surname) {
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

