package FabrykaV3;

public class SemiSyntheticMotoOil extends Oil {
    FabricOil fabricOil = new HighPerformanceOilFabric();
    SemiSyntheticMotoOil(){
        price=0;
        type10W =  fabricOil.oilTen("else");
        ageOfOil = "25.10.2022";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from moto old "+type10W+" oil: price 150zl");
        price +=150;
    }

    @Override
    public void FillOil() {
        invoice.add("\nFilling new Semi-Synthetic oil: price 150zl");
        price +=150;
    }

    @Override
    public void Utilization() {
        invoice.add("\nDisposing oil, price 150zl");
        price+=150;
        invoice.add(String.format("\nTotal price: |%2s zł|",price));

    }
}
