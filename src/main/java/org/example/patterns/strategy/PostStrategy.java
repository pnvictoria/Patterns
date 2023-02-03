package org.example.patterns.strategy;

public interface PostStrategy {
    boolean isPossibleNewPosition();
    void collectPositionDetails();
}
