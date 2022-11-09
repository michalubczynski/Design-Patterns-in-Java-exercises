package Adapter;

public class GniazdoGb implements GniazdoGbInterface{
    private  String gniazdoGb;

    public void setGniazdoGb(String gb){
        gniazdoGb = gb;
    }
    public String getGniazdoGb(){
        return  gniazdoGb;
    }
    public GniazdoGb() {
        this.gniazdoGb = "Stworzono ->gniazdoGb";
    }


    @Override
    public void podepnij() {
        System.out.println(gniazdoGb);

    }
}
