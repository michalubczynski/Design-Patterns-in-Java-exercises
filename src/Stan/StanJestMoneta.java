package Stan;

import java.util.Random;

public class StanJestMoneta implements IStan{
    AutomatSprzedajacy automatSprzedajacy ;

    public StanJestMoneta(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void uzupelnij() {
        System.out.println("Nie mozesz uzupelnic gum");
    }

    @Override
    public void wydawanieGumy() {
        System.out.println("Przekrec galke");
    }

    @Override
    public void wkladanieMonety() {
        System.out.println("Przekrec galke");
    }

    @Override
    public void przekrecanieGalki() {
        Random liczba = new Random();
        if(liczba.nextInt(101) == 50){
            System.out.println("Brawo wygrales gume");
            automatSprzedajacy.setStan(automatSprzedajacy.stanWygrana);
        }
        else {System.out.println("Przekrecono galke");
        automatSprzedajacy.setStan(automatSprzedajacy.stanGumaSprzedana);
        }



    }

    @Override
    public void wydawanieMonety() {
        System.out.println("Przekrec galke");
    }
}
