package Adapter;

import java.util.Arrays;

public class AdapterGniazd implements GniazdoGbInterface {
    private final GniazdoEu eu;

    public AdapterGniazd(GniazdoGb gb) {
        this.eu = gb.toString() + eu.podepnij();

    }


    @Override
    public String podepnij() {
        return eu.toString();
    }
}
