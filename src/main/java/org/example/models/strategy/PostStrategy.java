package org.example.models.strategy;

public interface PostStrategy {
    boolean isPossibleNewPosition();
    void collectPositionDetails();
}
