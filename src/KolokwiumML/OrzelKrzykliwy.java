package KolokwiumML;

public class OrzelKrzykliwy implements  Latajace{
    Observable observable;

    public OrzelKrzykliwy() {
        observable = new Observable(this);
    }

    @Override
    public void glos() {
        System.out.println("Krzykliwy-glos");
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
