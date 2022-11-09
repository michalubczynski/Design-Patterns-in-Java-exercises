package Adapter;

public class GniazdoEu implements GniazdoEuInterface {
    private final String gniazdoEu;

    public GniazdoEu() {
        this.gniazdoEu = "->gniazdoEU";
    }

    @Override
    public void podepnijEu() {
        System.out.println(gniazdoEu);
    }
}
