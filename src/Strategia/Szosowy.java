package Strategia;

public class Szosowy extends Motocykl{
    public Szosowy(){
        jechanieInterface = new JazdaWypoczynkowa();
        popisyInterface = new PalGume();
    }
    @Override
    public void wyswiet() {
        System.out.println("Szosowy jest wygodny");
    }
}
