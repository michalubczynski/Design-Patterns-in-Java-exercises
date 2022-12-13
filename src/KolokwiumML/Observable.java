package KolokwiumML;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements LatajaceObservable{
    ArrayList observers = new ArrayList();
    Latajace orzel;

    public Observable(Latajace orzel) {
        this.orzel = orzel;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(orzel);
        }
    }
}
