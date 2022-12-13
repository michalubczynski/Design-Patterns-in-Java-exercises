package KolokwiumML;

public class PtakSimulator {
    public static void main (String[] args){
        AbstractPtakFactory abstractPtakFactory = new CountingPtakFactory();

        Latajace orzelBielik = abstractPtakFactory.createOrzelBielik();
        Latajace orzelKrzykliwy = abstractPtakFactory.createOrzelKrzykliwy();
        Latajace orzelPolski = abstractPtakFactory.createOrzelPolski();
        Latajace wrona = new WronaAdapter(new Wrona());

        Stado stadoLatajace = new Stado();

        stadoLatajace.add(orzelBielik);
        stadoLatajace.add(orzelKrzykliwy);
        stadoLatajace.add(orzelPolski);
        stadoLatajace.add(wrona);

        Stado orlyPolskie = new Stado();

        Latajace orzelBielik1 = abstractPtakFactory.createOrzelBielik();
        Latajace orzelBielik2 = abstractPtakFactory.createOrzelBielik();
        Latajace orzelBielik3 = abstractPtakFactory.createOrzelBielik();
        Latajace orzelBielik4 = abstractPtakFactory.createOrzelBielik();

        orlyPolskie.add(orzelBielik1);
        orlyPolskie.add(orzelBielik2);
        orlyPolskie.add(orzelBielik3);
        orlyPolskie.add(orzelBielik4);

        stadoLatajace.add(orlyPolskie);

        Ornitolog ornitolog = new Ornitolog();
        stadoLatajace.registerObserver(ornitolog);
        stadoLatajace.glos();
        orlyPolskie.glos();
        System.out.println("Dzwieki wydano aż: " + LatajaceCounter.getLiczbaGlosow()+ " razy.");
    }
}
