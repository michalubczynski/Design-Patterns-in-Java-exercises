package KolokwiumML;

public class PtakFactory extends AbstractPtakFactory {
    @Override
    public Latajace createOrzelBielik() {
        return new OrzelBielik();
    }

    @Override
    public Latajace createOrzelKrzykliwy() {
        return new OrzelKrzykliwy();
    }

    @Override
    public Latajace createOrzelPolski() {
        return new OrzelPolski();
    }


}
