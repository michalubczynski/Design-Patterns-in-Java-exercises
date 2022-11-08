package Adapter;

public class GniazdoEu {
    private final String gniazdoEu;

    public GniazdoEu() {
        this.gniazdoEu = "->gniazdoEU";
    }

    String getGniazdoEU(){
        return gniazdoEu;
    }

    public String podepnij(){
        return this.getGniazdoEU();
    }

    @Override
    public String toString() {
        return gniazdoEu;
    }
}
