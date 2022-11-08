package FabrykaV3;

import FabrykaV3.OilFabric.CommonOilFabric;
import FabrykaV3.OilFabric.FabricOil;

public class MineralOil extends Oil {
    FabricOil fabricOil = new CommonOilFabric();

    public MineralOil(){
        price=0;
        type10W = fabricOil.oilTen("else");
        ageOfOil = "15.1.2021";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old "+type10W+" oil: price 30zl");
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
