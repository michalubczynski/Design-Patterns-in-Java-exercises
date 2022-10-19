package ObserwatorV4;
import java.util.Observable;
import java.util.Observer;

public class Subskrybent implements Observer, IWyswietl {
    private String newPost;

    @Override
    public void update(Observable o, Object arg) {
        this.newPost = (String) arg;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println(newPost);
    }
}
