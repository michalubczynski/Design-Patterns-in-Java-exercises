package FabrykaV1;

import java.util.ArrayList;

public class SyntheticOil  extends Oil{
    SyntheticOil(){
        invoice = new ArrayList<String>();
        type = "Synthetic";
        ageOfOil = "20.10.2022";
        RemoveOil();
        FillOil();
        Utilization();
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old oil: price 70zl");
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
