package Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gniazdo { // KLIENT
    public static void main(String[] args){
        GniazdoGbInterface gniazdoGbInterface = new GniazdoGb();
        gniazdoGbInterface.podepnij();
        gniazdoGbInterface = new AdapterGniazd(new GniazdoEu());
        gniazdoGbInterface.podepnij();
    }

}
