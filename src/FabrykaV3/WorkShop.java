package FabrykaV3;


public abstract class WorkShop {

    public abstract Oil CreateOil(String type);
    void changeOil(String oil){
        Oil o;
        o = CreateOil(oil);
        o.RemoveOil();
        o.FillOil();
        o.Utilization();
    }

}
