package FabrykaV3;

public class SemiSyntheticOil extends Oil {
    SemiSyntheticOil(){
        price=0;
        type10W = new CommonOilFabric().oilTen("thirty");
        ageOfOil = "25.10.2022";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old "+type10W+" oil: price 50zl");
        price +=50;
    }

    @Override
    public void FillOil() {
        invoice.add("\nFilling new Semi-Synthetic oil: price 50zl");
        price +=50;
    }

    @Override
    public void Utilization() {
        invoice.add("\nDisposing oil, price 50zl");
        price+=50;
        invoice.add(String.format("\nTotal price: |%2s zł|",price));

    }

}
