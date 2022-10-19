package ObserwatorV3;

import java.util.ArrayList;
import java.util.List;

public class Instagram implements IObservable{
    private List<Subskrybent> followers;
    private String newPost;
    private static int ktoryPost=0;
    Instagram(){
        followers = new ArrayList<Subskrybent>();
    }
    @Override
    public void attach(Subskrybent observer) {
        followers.add(observer);
    }

    @Override
    public void detach(Subskrybent observer) {
        followers.remove(observer);
    }

    @Override
    public void powiadom() {
        for (Subskrybent observer: followers) {
            observer.updatePost(ktoryPost, this.getNewPost());
        }
    }
    public  String getNewPost(){
            return newPost;
    }
    public void publishNewPost(String post){
        ktoryPost+=1;
        this.newPost = post;
        powiadom();
    }
}
