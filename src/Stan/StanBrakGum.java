package Stan;

public class StanBrakGum implements IStan{

    AutomatSprzedajacy automatSprzedajacy;

    public StanBrakGum(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }


    @Override
    public void uzupelnij() {
    automatSprzedajacy.dodajGumy();
    }

    @Override
    public void wydawanieGumy() {
        System.out.println("Nie ma pienionzka no i nie ma gumy");
    }

    @Override
    public void wkladanieMonety() {
    uzupelnij();
    System.out.println("Moneta wlozona do automatu");

    automatSprzedajacy.setStan(automatSprzedajacy.stanJesMoneta);
    }

    @Override
    public void przekrecanieGalki() {
    System.out.println("Przekrecono galke ale nie ma monety");
    }

    @Override
    public void wydawanieMonety() {
        System.out.println("Nie ma monety i nie ma monety");
    }


}
