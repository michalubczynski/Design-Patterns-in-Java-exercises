package KolokwiumML;

public interface LatajaceObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
