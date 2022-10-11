package Strategia;

public class Strategia {
    public static void main(String[] args){
        Motocykl motocykl = new Szosowy();
        motocykl.WykonajPopis();
        motocykl.WykonajJedz();
        Motocykl szybki = new Ścigacz();
        szybki.WykonajPopis();
        szybki.WykonajJedz();
        szybki.ustawJazde(new ZgaszonySilnik());
        szybki.WykonajJedz();


    }
}
