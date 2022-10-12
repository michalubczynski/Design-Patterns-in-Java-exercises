package Dekorator.V1;

public class Dekorator { // pozwala na dynamiczne przydzielanie zachowań danemu obiektowi
        public static void main(String[] args){
        Bułka bułka = new BułkaPoznańska();

        System.out.println("Cena do zapłaty"+bułka.PodajCene());
        System.out.println("Co jesz:"+ bułka.Opis());

        Bułka bułkaZSerem = new Ser(bułka);

        //System.out.println("Cena do zapłaty"+bułkaZSerem.PodajCene());
        //System.out.println("Co jesz:"+ bułkaZSerem.PodajCene());

        Bułka bułkaZSerem2 = new BułkaPoznańska();
        bułkaZSerem2 = new Ser(new Ser(new Cebula(bułka)));
                System.out.println("Cena do zapłaty"+bułkaZSerem2.PodajCene());
                System.out.println("Co jesz:"+ bułkaZSerem2.Opis());

    }
}
