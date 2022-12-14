package KolokwiumML;

public class LatajaceCounter implements  Latajace{
    Observable observable;
    Latajace orzel;
    static int liczbaGlosow;

    public LatajaceCounter(Latajace orzel) {
        this.orzel = orzel;
        observable = new Observable(this);
    }
    public static int getLiczbaGlosow() {
        return liczbaGlosow;
    }

    @Override
    public void glos() {
        orzel.glos();
        liczbaGlosow++;
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
