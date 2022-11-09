package Fasada;

public class ComputerClient {
    public  static  void main(String[] args){
        ComputerFasad computerFasad = new ComputerFasad();
        computerFasad.on();
        computerFasad.off();
    }
}
