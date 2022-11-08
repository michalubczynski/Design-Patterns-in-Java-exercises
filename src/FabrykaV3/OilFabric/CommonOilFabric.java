package FabrykaV3.OilFabric;

import FabrykaV3.FiveW.FiveW;
import FabrykaV3.FiveW.Fourty;
import FabrykaV3.FiveW.Thirty;
import FabrykaV3.TenW.Fifty;
import FabrykaV3.TenW.Sixty;
import FabrykaV3.TenW.TenW;

public class CommonOilFabric implements FabricOil {

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
