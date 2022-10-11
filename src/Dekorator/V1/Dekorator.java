package Dekorator.V1;

public class Dekorator {
        public static void main(String[] args){
        Bułka bułka = new BułkaPoznańska();

        System.out.println("Cena do zapłaty"+bułka.PodajCene());
        System.out.println("Co jesz:"+ bułka.PodajCene());

        Bułka bułkaZSerem = new Ser(bułka);

        System.out.println("Cena do zapłaty"+bułkaZSerem.PodajCene());
        System.out.println("Co jesz:"+ bułkaZSerem.PodajCene());



    }
}
