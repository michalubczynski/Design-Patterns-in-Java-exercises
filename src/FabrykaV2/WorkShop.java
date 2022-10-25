package FabrykaV2;


import FabrykaV1.MineralOil;
import FabrykaV1.SemiSyntheticOil;
import FabrykaV1.SyntheticOil;

public abstract class WorkShop {

    public abstract Oil CreateOil(String type);
    void changeOil(String oil){
        Oil o;
        o = CreateOil(oil);
        o.RemoveOil();
        o.FillOil();
        o.Utilization();
        System.out.println(o.ToString());
    }

}
