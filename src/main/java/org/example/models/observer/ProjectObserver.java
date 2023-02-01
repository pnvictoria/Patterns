package org.example.models.observer;

public interface ProjectObserver {
    void addObserver(Observers observers);
    void removeObserver(Observers observers);
    void notifiesObserver();

}
