package Singleton;

public class Kociol {
    private static Kociol kociol = new Kociol();
    private String zawartosc;
    private boolean pusty=true,ugotowany;
    protected Kociol(){
        zawartosc = "Pusty";
    }
    public static Kociol getKociol(){
        return kociol;
    }

    public String getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public boolean isPusty() {
        return pusty;
    }

    public void setPusty(boolean pusty) {
        this.pusty = pusty;
    }

    public boolean isUgotowany() {
        return ugotowany;
    }

    public void setUgotowany(boolean ugotowany) {
        this.ugotowany = ugotowany;
    }
    public void wypelnij(){
        if(isPusty()){
            setPusty(false);
            setUgotowany(false);
            System.out.println("Wypelniamy kociol");
        }else System.out.println("Najpierw oproznij kociol");
    }
    public void wylej(){

        if (isPusty()) {
            System.out.println("Brak zawartosci do wylania");
        }
        else if(!isUgotowany()){
            System.out.println("Zawartosc nieugotowana");
        }
        else {
            setPusty(true);
            setUgotowany(false);
            System.out.println("Oprozniamy kociol");
        }
    }
    public void ugotuj(){
        if(!isPusty()&& !isUgotowany()){
            setUgotowany(true);
            System.out.println("Zagotowano kociol");
        }else System.out.println("Niemozna zagotowac kotła");
    }
}
