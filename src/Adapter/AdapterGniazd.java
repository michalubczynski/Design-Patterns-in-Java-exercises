package Adapter;

import java.util.Arrays;

public class AdapterGniazd implements GniazdoGbInterface {
     GniazdoEuInterface eu;

    public AdapterGniazd(GniazdoEuInterface eu) {
        this.eu = eu;
    }

    @Override
    public void podepnij() {
        System.out.print("jestem gniazdem EU opakowanym przez GB ");
        eu.podepnijEu();

    }
}
