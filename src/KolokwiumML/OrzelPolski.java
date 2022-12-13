package KolokwiumML;

public class OrzelPolski implements  Latajace{
    Observable observable;

    public OrzelPolski() {
        observable = new Observable(this);
    }

    @Override
    public void glos() {
        System.out.println("Polski-glos");
        notifyObservers();
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
