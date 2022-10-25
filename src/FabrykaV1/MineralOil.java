package FabrykaV1;

public class MineralOil extends Oil {
    MineralOil(){
        type = "Mineral";
        ageOfOil = "15.1.2021";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old oil: price 30zl");
        price +=30;
    }

    @Override
    public void FillOil() {
        invoice.add("\nFilling new Semi-Synthetic oil: price 30zl");
        price +=30;
    }

    @Override
    public void Utilization() {
        invoice.add("\nDisposing oil, price 50zl");
        price+=50;
        invoice.add(String.format("\nTotal price: |%2s zł|",price));

    }
}
