package PolecenieV2;

public class EmptyCommand implements ICommand{
    @Override
    public void execute() {
        System.out.println("Brak metody");
    }

    @Override
    public void undo() {
        System.out.println("Brak metody");
    }
}
