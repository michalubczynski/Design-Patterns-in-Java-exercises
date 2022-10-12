package Singleton;

public final class Kociol {
    private static Kociol kociol;
    public String value;
    private String zawartosc;
    private boolean pusty=true,ugotowany;
    private Kociol(String value){
        this.value=value;
        zawartosc = "Pusty";
    }
    public static Kociol getInstance(String value) {
        if (kociol == null) {
            kociol = new Kociol(value);
        }
        return kociol;
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
