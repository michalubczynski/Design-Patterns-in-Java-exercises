package KolokwiumML;

public class Ornitolog implements Observer{
    @Override
    public void update(LatajaceObservable orzel) {
        System.out.println(  orzel + " dal glos");
    }
}
