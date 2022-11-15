package Polecenie;

public class OrderPhone implements ICommand {
    private String marka;
    private String model;
    private Receiver receiver;

    public OrderPhone(String marka, String model, Receiver receiver) {
        this.marka = marka;
        this.model = model;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
       receiver.dodajID( "Zamowiono "+marka+" "+model);
    }
}
