package ObserwatorV1;

public class WarunkiBiezaceWyswietl implements WyswietlElement, Obserwator { //obserwator  (obiekt implementujacy tryby wyswietlania)
    private float temperatura, wilgotnosc;
    Boolean Jest;
        WarunkiBiezaceWyswietl(float temperatura, float wilgotnosc){
            this.temperatura=temperatura;
            this.wilgotnosc=wilgotnosc;
            this.Jest = true;
        }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc){
        this.temperatura = temperatura;
        this.wilgotnosc=wilgotnosc;
        wyswietl();
    }

    @Override
    public boolean Jest() {
        return this.Jest;
    }

    @Override
    public void wyswietl(){
        System.out.println("Warunki:"+temperatura+ "stopni C oraz "+ wilgotnosc+"% wilgotnosci.");
    }
}
