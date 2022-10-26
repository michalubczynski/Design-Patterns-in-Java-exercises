package FabrykaV2;


public abstract class WorkShop {

    public abstract Oil createOil(String type, Oil o);
    void changeOil(String type){
        Oil o=null;
        o = createOil(type, o);
        o.RemoveOil();
        o.FillOil();
        o.Utilization();
        System.out.println(o.ToString());
    }

}
