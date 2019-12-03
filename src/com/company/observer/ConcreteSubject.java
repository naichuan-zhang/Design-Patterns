package com.company.observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            ((Observer) iterator.next()).update(this);
        }
    }
}
