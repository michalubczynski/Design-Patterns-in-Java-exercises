package FabrykaV3;

import FabrykaV3.FiveW.FiveW;
import FabrykaV3.TenW.TenW;

import java.util.ArrayList;

public abstract class Oil {
    float price;
    FiveW type5W;
    TenW type10W;
    String  ageOfOil;
    ArrayList<String> invoice  = new ArrayList<String>();
    public abstract void RemoveOil();
    public abstract void FillOil();
    public abstract void Utilization();
    String getInvoice(){
        String invoice_="";
        for(String s: invoice){
            invoice_+=s;
        }
        return invoice_;
    }
    public String ToString(){
        return getInvoice();
    }



}
