package FabrykaV2;

import java.util.ArrayList;

public class SyntheticMotoOil extends Oil{
    SyntheticMotoOil(){
        invoice = new ArrayList<String>();
        type = "Synthetic-motorcycle";
        ageOfOil = "20.10.2020";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old oil: price 170zl");
        price +=170;
    }

    @Override
    public void FillOil() {
        invoice.add("\nFilling new Semi-Synthetic oil: price 200zl");
        price +=200;
    }

    @Override
    public void Utilization() {
        invoice.add("\nDisposing oil, price 150zl");
        price+=150;
        invoice.add(String.format("\nTotal price: |%2s zł|",price));

    }
}
