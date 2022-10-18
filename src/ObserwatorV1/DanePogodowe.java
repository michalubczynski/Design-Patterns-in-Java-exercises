package ObserwatorV1;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot {
    private List<Obserwator> Obserwatorzy;
    public DanePogodowe(){
        Obserwatorzy = new ArrayList<>();
    }
    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        this.Obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        this.Obserwatorzy.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {
        for(Obserwator obserwator: Obserwatorzy){
            if(!(obserwator.Jest())) obserwator.aktualizacja(20,20);
        }
    }


    //obiekt implementujaca podmiot obserwowany


}
