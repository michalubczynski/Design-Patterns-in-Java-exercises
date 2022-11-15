package Polecenie;

public class Invoker { // Przekazuje on jedynie polecenie do odbiorcy (poprzez wywołanie metody).
    public void takeComputerOrder(OrderComputer orderComputer){
        orderComputer.execute();
    }
    public void takePhoneOrder(OrderPhone orderPhone){
        orderPhone.execute();
    }
}
