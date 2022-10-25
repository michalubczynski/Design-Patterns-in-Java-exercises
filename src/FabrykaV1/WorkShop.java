package FabrykaV1;

public class WorkShop {
    void changeOil(SimpleOilFactory s){
        Oil o;
        o = s.CreateOil("semi");
        o.RemoveOil();
        o.FillOil();
        o.Utilization();
        System.out.println(o.ToString());
    }
}
