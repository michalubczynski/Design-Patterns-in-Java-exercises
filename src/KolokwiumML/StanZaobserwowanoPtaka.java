package KolokwiumML;

public class StanZaobserwowanoPtaka implements IStan{
    Ornitolog ornitolog;

    public StanZaobserwowanoPtaka(Ornitolog ornitolog) {
        this.ornitolog = ornitolog;
    }

    @Override
    public void oznajmienieObserwacji() {
        System.out.println("Zmieniam zdanie, zobserwowalem:" + ornitolog.getOstatniOkaz() );
        ornitolog.setStan(ornitolog.stanOczekujeNaGlos);
    }

    @Override
    public void czuwanie() {
        System.out.println("Przechodze w tryb oczekiwania");
    }
}
