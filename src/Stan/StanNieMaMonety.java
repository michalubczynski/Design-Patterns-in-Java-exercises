package Stan;

public class StanNieMaMonety implements IStan{
    AutomatSprzedajacy automatSprzedajacy ;

    public StanNieMaMonety(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void uzupelnij() {
        System.out.println("Nie mozesz uzupelnic gum");
    }

    @Override
    public void wydawanieGumy() {
        System.out.println("Wloz monete");
    }

    @Override
    public void wkladanieMonety() {
        System.out.println("Wlozono monete");

        automatSprzedajacy.setStan(automatSprzedajacy.stanJesMoneta);
    }

    @Override
    public void przekrecanieGalki() {
        System.out.println("Wloz monete");

    }

    @Override
    public void wydawanieMonety() {
        System.out.println("Wloz monete");
    }
}
