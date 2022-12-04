package Stan;

public class Tester {                                                                                                          //zmianę zachowania wraz ze  zmianą jego wewnętrznego stanu
    public static void main(String[] args){
        AutomatSprzedajacy automatSprzedajacy = new AutomatSprzedajacy();
        automatSprzedajacy.wkladanieMonety();
        automatSprzedajacy.wydawanieGumy();
        automatSprzedajacy.przekrecanieGalki();
        automatSprzedajacy.wydawanieGumy();
        System.out.println(automatSprzedajacy);
    }
}
