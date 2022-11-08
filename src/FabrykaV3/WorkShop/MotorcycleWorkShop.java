package FabrykaV3.WorkShop;

import FabrykaV3.MineralMotoOil;
import FabrykaV3.Oil;
import FabrykaV3.SemiSyntheticMotoOil;
import FabrykaV3.SyntheticMotoOil;

public class MotorcycleWorkShop extends WorkShop {

    @Override
    public Oil CreateOil(String type) {

        Oil oil = null;
        if(type == "semi-moto"){
            oil = new SemiSyntheticMotoOil();
            System.out.println(oil.ToString()) ;

        }
        else if(type == "synth-moto"){
            oil = new SyntheticMotoOil();
            System.out.println(oil.ToString()) ;

        }
        else if(type == "mineral-moto") {
            oil = new MineralMotoOil();
            System.out.println(oil.ToString());
        }
        else throw new IllegalArgumentException("Brak oleju");
        return oil;

    }
}
