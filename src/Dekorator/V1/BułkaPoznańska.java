package Dekorator.V1;

public class BułkaPoznańska extends Bułka{
    private float Cena=2.5F;
    @Override
    public float PodajCene() {
        return Cena;
    }

    @Override
    public String Opis() {
        return  super.Opis() + " Poznanska";
    }
}
