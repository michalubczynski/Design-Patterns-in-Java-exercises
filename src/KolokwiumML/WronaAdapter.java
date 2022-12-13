package KolokwiumML;

public class WronaAdapter implements Latajace{
    Wrona wrona;
    Observable observable;

    public WronaAdapter(Wrona wrona) {
        this.wrona = wrona;
        observable = new Observable(this);
    }

    @Override
    public void glos() {
        wrona.glos();
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
