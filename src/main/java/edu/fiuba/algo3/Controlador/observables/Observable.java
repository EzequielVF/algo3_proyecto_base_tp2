package edu.fiuba.algo3.Controlador.observables;

import java.util.ArrayList;

public interface Observable {
    /*private ArrayList<Observer> observers;

    public Observable() { observers = new ArrayList<>();}

    public void addObserver(Observer observer) {observers.add(observer);}

    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.change());
    }*/
    void addObserver(Observer observer);
    void notifyObservers();
}
