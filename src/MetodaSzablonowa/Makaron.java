package MetodaSzablonowa;

public abstract class Makaron {
    public final void recepturaMakaronu(){
        gotowanieMakaronu();
        tworzenieSosu();
        if(customerWantsMeat()){
            dodawanieMiesa();
        }
        mieszanieMakaronuZSosem();

        nakladanieNaTalerz();
    }
    public void gotowanieMakaronu(){
        System.out.println("gotujemy makaron");
    }
    public void mieszanieMakaronuZSosem(){
        System.out.println("Mieszamy makaron");
    }
    public void nakladanieNaTalerz(){
        System.out.println("Nakladamy makaron");
    }
    public abstract void tworzenieSosu();
    public abstract void dodawanieMiesa();
    boolean customerWantsMeat(){return true;}

}

