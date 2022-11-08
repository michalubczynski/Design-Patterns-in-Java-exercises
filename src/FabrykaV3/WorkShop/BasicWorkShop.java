package FabrykaV3.WorkShop;


import FabrykaV3.MineralOil;
import FabrykaV3.Oil;
import FabrykaV3.SemiSyntheticOil;
import FabrykaV3.SyntheticOil;

public class BasicWorkShop extends WorkShop {

    @Override
    public Oil CreateOil(String type) {

            Oil oil = null;
            if(type == "semi"){
                oil = new SemiSyntheticOil();
                System.out.println(oil.ToString()) ;

            }
            else if(type == "synth"){
                oil = new SyntheticOil();
                System.out.println(oil.ToString()) ;

            }
            else if(type == "mineral") {
                MineralOil m = new MineralOil();
                System.out.println(m.ToString());
            }
            else throw new IllegalArgumentException("Brak oleju");
            return oil;

    }
}
