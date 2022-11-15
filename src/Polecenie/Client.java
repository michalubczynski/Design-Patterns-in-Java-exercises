package Polecenie;

public class Client {
    private Invoker invoker;
    private Receiver receiver;

    public Client(Invoker invoker, Receiver receiver) {
        this.invoker = invoker;
        this.receiver = receiver;
    }
    public void makeOrder(boolean czyComputer, boolean czyTelefon){
        if(czyComputer){
            OrderComputer orderComputer = new OrderComputer("PENTIUM");
            this.invoker.takeComputerOrder(orderComputer);
        }
        if(czyTelefon){
            OrderPhone orderPhone = new OrderPhone("Xiaomi","PRO",this.receiver);
            this.invoker.takePhoneOrder(orderPhone);
        }
    }
}
