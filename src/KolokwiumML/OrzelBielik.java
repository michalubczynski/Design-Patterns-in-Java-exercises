package KolokwiumML;

public class OrzelBielik implements  Latajace{
    Observable observable;

    public OrzelBielik() {
        observable = new Observable(this);
    }

    @Override
    public void glos() {
        System.out.println("Bielik-glos");
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
