package KolokwiumML;

public class CountingPtakFactory extends AbstractPtakFactory {
    @Override
    public Latajace createOrzelBielik() {
        return new LatajaceCounter(new OrzelBielik()) ;
    }

    @Override
    public Latajace createOrzelKrzykliwy() {
        return new LatajaceCounter(new OrzelKrzykliwy());
    }

    @Override
    public Latajace createOrzelPolski() {
        return OrzelPolski.getInstance();
    }


}
