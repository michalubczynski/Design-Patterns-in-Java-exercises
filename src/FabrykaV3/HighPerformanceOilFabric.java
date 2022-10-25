package FabrykaV3;

public class HighPerformanceOilFabric implements FabricOil{
    @Override
    public FiveW oilFive(String w) {
        if(w == "thirty"){
            return new Thirty();
        }
        else
            return new Fourty();
    }

    @Override
    public TenW oilTen(String w) {
        if(w == "Fifty"){
            return new Fifty();
        }
        else
            return new Sixty();
    }
}
