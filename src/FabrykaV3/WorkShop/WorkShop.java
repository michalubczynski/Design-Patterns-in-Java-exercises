package FabrykaV3.WorkShop;


import FabrykaV3.Oil;

public abstract class WorkShop {

    public abstract Oil CreateOil(String type);
    public void changeOil(String oil){
        Oil o;
        o = CreateOil(oil);
        o.RemoveOil();
        o.FillOil();
        o.Utilization();
    }

}
