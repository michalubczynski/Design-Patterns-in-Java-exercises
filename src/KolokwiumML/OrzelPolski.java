package KolokwiumML;

public final class OrzelPolski implements  Latajace{

    private static OrzelPolski orzelPolski;
    Observable observable;

    private OrzelPolski() {
        observable = new Observable(this);
    }
    public static OrzelPolski getInstance(){
        if(orzelPolski == null){
            orzelPolski = new OrzelPolski();
        }
        return orzelPolski;
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
