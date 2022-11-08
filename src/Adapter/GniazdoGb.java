package Adapter;

public class GniazdoGb implements GniazdoGbInterface{
    private final String gniazdoGb;

    public GniazdoGb() {
        this.gniazdoGb = "->gniazdoGb";
    }


    @Override
    public String podepnij() {
        return gniazdoGb;
    }
}
