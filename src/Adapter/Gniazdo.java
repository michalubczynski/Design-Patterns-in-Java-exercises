package Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gniazdo { // KLIENT
    private final String gniazdo;
    private final List<GniazdoGbInterface> content = new ArrayList<>();
    public Gniazdo(String gniazdo){
        this.gniazdo=gniazdo;
    }

}
