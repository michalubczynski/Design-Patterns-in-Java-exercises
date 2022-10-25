package FabrykaV2;

import java.util.ArrayList;

public abstract class Oil {
    float price;
    String type;
    String  ageOfOil;
    ArrayList<String> invoice  = new ArrayList<String>();
    abstract void RemoveOil();
    abstract void FillOil();
    abstract void Utilization();
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
