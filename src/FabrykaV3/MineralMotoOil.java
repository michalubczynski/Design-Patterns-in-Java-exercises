package FabrykaV3;

import FabrykaV3.OilFabric.FabricOil;
import FabrykaV3.OilFabric.HighPerformanceOilFabric;

public class MineralMotoOil extends Oil {
    FabricOil fabricOil = new HighPerformanceOilFabric();

    public MineralMotoOil(){
        price=0;
        type5W = fabricOil.oilFive("thirty");
        ageOfOil = "15.1.2020";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from moto old "+type5W+" oil: price 130zl");
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
