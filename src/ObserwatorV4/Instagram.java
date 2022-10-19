package ObserwatorV4;

import java.util.Observable;

public class Instagram extends Observable {
    private String newPost;
    public void setNewPost(String newPost){
        this.newPost=newPost;
        setChanged();
        notifyObservers(newPost);
    }
}
