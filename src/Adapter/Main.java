package Adapter;


public class Main { //
    public static void main(String[] args){
    GniazdoGb gniazdoGb = new GniazdoGb();
    GniazdoEu gniazdoEu = new GniazdoEu();
    AdapterGniazd adapterGniazd = new AdapterGniazd(gniazdoGb);
    System.out.println(gniazdoEu.podepnij());
    }
}
