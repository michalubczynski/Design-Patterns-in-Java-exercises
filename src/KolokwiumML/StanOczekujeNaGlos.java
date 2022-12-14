package KolokwiumML;

public class StanOczekujeNaGlos implements IStan{
    Ornitolog ornitolog;

    public StanOczekujeNaGlos(Ornitolog ornitolog) {
        this.ornitolog = ornitolog;
    }

    @Override
    public void oznajmienieObserwacji() {
        System.out.println("Hurra, zobserwowalem:" + ornitolog.getOstatniOkaz() );
        ornitolog.setStan(ornitolog.stanOczekujeNaGlos);
    }

    @Override
    public void czuwanie() {
        System.out.println("Nadal czekam");
    }
}
