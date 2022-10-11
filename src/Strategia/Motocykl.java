package Strategia;

public abstract class Motocykl {
    JechanieInterface jechanieInterface;                                                                                        //k
    PopisyInterface popisyInterface;
    public Motocykl(){}
    public abstract void wyswiet();
    public void WykonajPopis(){
        popisyInterface.popiszSie();                                                                                            //d
    }
    public void WykonajJedz(){
        jechanieInterface.Jedź();
    }
    public void  ustawJazde(JechanieInterface Ijechanie){jechanieInterface = Ijechanie;}
    public void ustawPopis(PopisyInterface Ipopis){popisyInterface = Ipopis;}
}
