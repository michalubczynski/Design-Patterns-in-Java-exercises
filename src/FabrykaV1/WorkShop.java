package FabrykaV1;

public class WorkShop {
    SimpleOilFactory s = new SimpleOilFactory();
    void changeOil(){
        Oil o;
        o = s.CreateOil("semi");
        o.RemoveOil();
        o.FillOil();
        o.Utilization();
        System.out.println(o.ToString());
    }
}
