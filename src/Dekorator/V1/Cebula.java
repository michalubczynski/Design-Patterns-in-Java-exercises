package Dekorator.V1;

public class Cebula extends  DodatkiDoBulkiDecorator {
        private Bułka bułka;
        public Cebula(Bułka bułka){
            this.bułka=bułka;
        }
        @Override
        public float PodajCene() {
            return bułka.PodajCene()+1F;
        }

        @Override
        public String Opis() {
            return bułka.Opis() +" z cebulo";
        }

}
