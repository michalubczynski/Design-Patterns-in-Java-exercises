package FabrykaV2;

public class SemiSyntheticMotoOil extends Oil{
    SemiSyntheticMotoOil(){
        type = "Semi-Synthetic-motorcycle";
        ageOfOil = "25.10.2022";
    }
    @Override
    public void RemoveOil() {
        invoice.add("\nRemoving from car old oil: price 150zl");
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
