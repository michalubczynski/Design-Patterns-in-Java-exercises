package Strategia;

public class Ścigacz extends Motocykl{
    public Ścigacz(){
        jechanieInterface = new JazdaWyczynowa();
        popisyInterface = new JazdaNaKole();
    }
    @Override
    public void wyswiet() {
        System.out.println("Ostry jak przecinak i szybki jak blyskawica");
    }
}
