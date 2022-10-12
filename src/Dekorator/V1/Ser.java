package Dekorator.V1;

public class Ser extends DodatkiDoBulkiDecorator{
    private Bułka bułka;
    public Ser(Bułka bułka){
        this.bułka=bułka;
    }
    @Override
    public float PodajCene() {
        return bułka.PodajCene()+1F;
    }

    @Override
    public String Opis() {
        return bułka.Opis() +" z serem";
    }
}
