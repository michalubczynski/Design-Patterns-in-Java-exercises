package Dekorator.V1;

public class BułkaSlaska extends Bułka{
    @Override
    public float PodajCene() {
        return 3F;
    }
    @Override
    public String Opis() {
        return  super.Opis() + " Slaska";
    }
}
