package KolokwiumML;

public class Ornitolog implements Observer{
    IStan stanOczekujeNaGlos;
    IStan stanZabserwowanoPtaka;
    IStan stan ;

    LatajaceObservable ostatniOkaz;


    public LatajaceObservable getOstatniOkaz() {
        return ostatniOkaz;
    }

    public void setOstatniOkaz(LatajaceObservable ostatniOkaz) {
        this.ostatniOkaz = ostatniOkaz;
    }

    public void setStan(IStan stan) {
        this.stan = stan;
    }
     Ornitolog(){
        stanOczekujeNaGlos = new StanOczekujeNaGlos(this);
        stanZabserwowanoPtaka = new StanZaobserwowanoPtaka(this);
        stan = stanOczekujeNaGlos;
     }

    public void oznajmienieObserwacji() { stan.oznajmienieObserwacji();}
    public void czuwanie() { stan.czuwanie(); }

    @Override
    public void update(LatajaceObservable orzel) {
        setOstatniOkaz(orzel);
        oznajmienieObserwacji();
        czuwanie();
    }
}
