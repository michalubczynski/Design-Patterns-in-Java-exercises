package Polecenie;

public class Main {
    public static void main(String[] args){
        Invoker invoker=new Invoker();
        Receiver receiver = new Receiver();
        Client client = new Client(invoker,receiver);
        client.makeOrder(true,false);
        client.makeOrder(false,true);
        

    }
}
