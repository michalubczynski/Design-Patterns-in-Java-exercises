package KolokwiumML;

import java.util.ArrayList;
import java.util.Iterator;

public class Stado implements Latajace{
    Observable observable;
    ArrayList ptaki = new ArrayList();

    public Stado() {
        observable = new Observable(this);
    }

    public void add(Latajace latajace){
        ptaki.add(latajace);
    }

    @Override
    public void glos() {
        Iterator iterator = ptaki.iterator();
        while (iterator.hasNext()){
            Latajace latajace = (Latajace) iterator.next();
            latajace.glos();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
    observable.notifyObservers();
    }
}
