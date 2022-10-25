package FabrykaV3;

import java.util.ArrayList;

public class SyntheticOil  extends Oil {
    SyntheticOil(){
        price=0;
        type10W =  new CommonOilFabric().oilTen("thirty");
        ageOfOil = "20.10.2022";
        invoice.add(type10W.toString());
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old "+type10W+" oil: price 70zl");
        price +=70;
    }

    @Override
    public void FillOil() {
        invoice.add("\nFilling new Semi-Synthetic oil: price 100zl");
        price +=100;
    }

    @Override
    public void Utilization() {
        invoice.add("\nDisposing oil, price 50zl");
        price+=50;
        invoice.add(String.format("\nTotal price: |%2s zł|",price));

    }

}
