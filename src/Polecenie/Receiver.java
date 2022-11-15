package Polecenie;

public class Receiver {
    static int id = 1000;
    public void dodajID(String item){
        System.out.println(item+ "SIM: "+ id);
        id++;
    }
}
