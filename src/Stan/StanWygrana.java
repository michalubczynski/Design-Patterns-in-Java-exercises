package Stan;

public class StanWygrana implements IStan{
    AutomatSprzedajacy automatSprzedajacy ;

    public StanWygrana(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void uzupelnij() {
        System.out.println("Zabroniono");
    }

    @Override
    public void wydawanieGumy() {

        System.out.println("Brawo wygrales extra gume");
        automatSprzedajacy.setStan(automatSprzedajacy.stanGumaSprzedana);

    }

    @Override
    public void wkladanieMonety() {
        System.out.println("Zabroniono");
    }

    @Override
    public void przekrecanieGalki() {
        System.out.println("Zabroniono");
    }

    @Override
    public void wydawanieMonety() {
        System.out.println("Zabroniono");
    }
}
