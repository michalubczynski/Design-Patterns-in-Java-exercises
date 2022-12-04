package Stan;

public class AutomatSprzedajacy {

    int ileJest = 10;
    public void dodajGumy(){
        ileJest+=10;
    }
    public void usunGume(){
        ileJest-=1;
    }
    IStan stanBrakGum;
    IStan stanGumaSprzedana;
    IStan stanJesMoneta;
    IStan stanNiemaMoneta;
    IStan stanWygrana;

    public IStan getStan() {
        return stan;
    }

    public void setStan(IStan stan) {
        this.stan = stan;
    }

    IStan stan ;


    public AutomatSprzedajacy() {
        stanBrakGum = new StanBrakGum(this);
        stanGumaSprzedana = new StanGumaSprzedana(this);
        stanJesMoneta = new StanJestMoneta(this);
        stanNiemaMoneta = new StanNieMaMonety(this);
        stanWygrana = new StanWygrana(this);
        stan = stanNiemaMoneta;
    }
    void uzupelnij(){
        stan.uzupelnij();
    }
    void wydawanieGumy(){
        stan.wydawanieGumy();
    }
    void wkladanieMonety(){
        stan.wkladanieMonety();
    }
    void przekrecanieGalki(){
        stan.przekrecanieGalki();
    }
    void wydawanieMonety(){
        stan.wydawanieMonety();
    }

    @Override
    public String toString() {
        return "AutomatSprzedajacy{" +
                "ileJest=" + ileJest +
                ", stan=" + stan +
                '}';
    }
}
