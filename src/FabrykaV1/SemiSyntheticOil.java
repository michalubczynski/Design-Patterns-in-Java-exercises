package FabrykaV1;

import java.util.ArrayList;
import java.util.Date;

public class SemiSyntheticOil extends Oil {
    SemiSyntheticOil(){
        type = "Semi-Synthetic";
        ageOfOil = "25.10.2022";
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old oil: price 50zl");
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
