package Polecenie;

public class OrderComputer implements ICommand {
    private String brand;

    public OrderComputer(String brand) {
        this.brand = brand;
    }

    @Override
    public void execute() {
        System.out.println("Zamowiles"+ brand);
    }
}
