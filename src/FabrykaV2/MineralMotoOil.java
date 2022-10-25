package FabrykaV2;

public class MineralMotoOil extends Oil{
    MineralMotoOil(){
        type = "Mineral-motorcycle";
        ageOfOil = "15.1.2020";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old oil: price 130zl");
        price +=130;
    }

    @Override
    public void FillOil() {
        invoice.add("\nFilling new Semi-Synthetic oil: price 130zl");
        price +=130;
    }

    @Override
    public void Utilization() {
        invoice.add("\nDisposing oil, price 150zl");
        price+=150;
        invoice.add(String.format("\nTotal price: |%2s zł|",price));

    }
}
