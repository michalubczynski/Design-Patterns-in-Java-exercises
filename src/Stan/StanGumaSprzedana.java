package Stan;

public class StanGumaSprzedana implements  IStan{
    AutomatSprzedajacy automatSprzedajacy;

    public StanGumaSprzedana(AutomatSprzedajacy automatSprzedajacy) {
        this.automatSprzedajacy = automatSprzedajacy;
    }

    @Override
    public void uzupelnij() {
        System.out.println("Nie mozesz uzupelnic automatu");
    }

    @Override
    public void wydawanieGumy() {
        System.out.println("Wydaje Gume");
        automatSprzedajacy.usunGume();
        automatSprzedajacy.setStan(automatSprzedajacy.stanNiemaMoneta);
    }

    @Override
    public void wkladanieMonety() {
        System.out.println("Najpierw wydanie gumy");
    }

    @Override
    public void przekrecanieGalki() {
        System.out.println("Nie mozesz przekrecic bo nie wydano gumy");
    }

    @Override
    public void wydawanieMonety() {
        System.out.println("Nie ma z czego wydac");
    }
}
