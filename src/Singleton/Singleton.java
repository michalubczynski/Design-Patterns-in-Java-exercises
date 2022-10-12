package Singleton;

public class Singleton {
    public static void main(String[] args){
        Kociol kociol = Kociol.getInstance("Pierwszy") ;
        kociol.getZawartosc();
        kociol.wypelnij();
        kociol.ugotuj();
        kociol.wylej();
        kociol.wylej();
        System.out.println(kociol.toString() + kociol.value );
        Kociol kociol1 = Kociol.getInstance("Drugi") ;
        System.out.println(kociol1.toString() + kociol1.value);
    }
}
